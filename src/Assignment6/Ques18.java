package Assignment6;

import java.util.Scanner;

public class Ques18 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int originalNumber = number;
	        int reversed = 0;
	        int temp = number; 

	        while (temp > 0) {
	            int digit = temp % 10;
	            reversed = reversed * 10 + digit;
	            temp = temp / 10;
	        }

	       
	        if (number < 0) {
	            reversed = reversed;
	        }

	        if (number == reversed) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is not a palindrome.");
	        }

	       
	    }
	}




