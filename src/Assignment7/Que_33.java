package Assignment7;

import java.util.Scanner;

public class Que_33 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Digits :-");
	        int number = sc.nextInt();
	        int count = 0;

	        do {
	            int digit = number % 10;
	            if (digit % 2 != 0) {
	                count++;
	            }
	            number /= 10;
	        } while (number != 0);

	        System.out.println("Odd digits count: " + count);
	    }
	}



