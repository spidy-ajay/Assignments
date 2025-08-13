package Assignment7;

import java.util.Scanner;

public class Que_34 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter here :-");
	        int number = sc.nextInt();

	        while (number > 9) {
	            int sum = 0;
	            while (number > 0) {
	                sum += number % 10;
	                number /= 10;
	            }
	            number = sum;
	        }

	        System.out.println("Final single digit: " + number);
	    }
	}



