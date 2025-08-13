package Assignment6;

import java.util.Scanner;

public class Ques16 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        long factorial = 1; 
	        int i = 1;
	        
	        while (i <= number) {
	            factorial *= i;
	            i++;
	        }
	        
	        System.out.println("Factorial of " + number + " is: " + factorial);
	        
	        scanner.close();
	    }
	}


	