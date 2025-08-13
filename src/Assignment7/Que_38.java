package Assignment7;

import java.util.Scanner;

public class Que_38 {
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter here :");
	        int binary = sc.nextInt();
	        int decimal = 0, base = 1;

	        while (binary > 0) {
	            int last = binary % 10;
	            decimal += last * base;
	            base *= 2;
	            binary /= 10;
	        }

	        System.out.println("Decimal: " + decimal);
	    }
	}



