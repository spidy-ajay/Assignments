package Assignment7;

import java.util.Scanner;

public class Que_49 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        final int correctPIN = 1234;
	        int enteredPIN;

	        do {
	            System.out.print("Enter 4-digit PIN: ");
	            enteredPIN = sc.nextInt();
	        } while (enteredPIN != correctPIN);

	        System.out.println("Access granted!");
	    }
	}



