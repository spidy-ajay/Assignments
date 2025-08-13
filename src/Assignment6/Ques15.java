package Assignment6;

import java.util.Scanner;

public class Ques15 {
	 
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        int sum = 0;
		        int temp = number; 

		        while (temp > 0) {
		            int digit = temp % 10; 
		            sum += digit;          
		            temp = temp / 10;       
		        }

		        System.out.println("Sum of digits: " + sum);

		        scanner.close();
		    }
		}


