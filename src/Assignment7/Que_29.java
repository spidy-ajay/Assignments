package Assignment7;

import java.util.Scanner;

public class Que_29 {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number;

	        do {
	            System.out.print("Enter a number: ");
	            number = sc.nextInt();
	        } while (number % 2 != 0);

	        System.out.println("You entered an even number: " + number);
	        sc.close();
	    }
	}



