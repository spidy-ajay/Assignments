package Assignment6;

import java.util.Scanner;

public class Ques20 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int temp = Math.abs(number);  
	        int maxDigit = 0;

	        if (temp == 0) {
	            maxDigit = 0;
	        } else {
	            while (temp > 0) {
	                int digit = temp % 10;
	                if (digit > maxDigit) {
	                    maxDigit = digit;
	                }
	                temp = temp / 10;
	            }
	        }

	        System.out.println("Greatest digit is: " + maxDigit);

	        scanner.close();
	    }
	}
