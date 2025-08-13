package Assignment6;

import java.util.Scanner;

public class Ques19 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int product = 1;
	        int temp = number;

	        if (temp == 0) {
	            product = 0;
	        } else {
	            while (temp > 0) {
	                int digit = temp % 10;  
	                product *= digit;       
	                temp = temp / 10;       
	            }
	        }

	        System.out.println("Product of digits: " + product);

	        scanner.close();
	    }
	}


