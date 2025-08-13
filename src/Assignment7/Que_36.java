package Assignment7;

import java.util.Scanner;

public class Que_36 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number");
	        int number = sc.nextInt();

	        do {
	            int digit = number % 10;
	            System.out.print(digit + " ");
	            number /= 10;
	        } while (number > 0);
	    }
	}



