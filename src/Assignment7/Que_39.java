package Assignment7;

import java.util.Scanner;

public class Que_39 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number :");
	        int decimal = sc.nextInt();
	        int octal = 0, place = 1;

	        while (decimal > 0) {
	            int rem = decimal % 8;
	            octal += rem * place;
	            place *= 10;
	            decimal /= 8;
	        }

	        System.out.println("Octal: " + octal);
	    }
	}


