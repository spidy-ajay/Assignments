package Assignment7;

import java.util.Scanner;

public class Que_17 {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int rev = 0;
	        int temp = Math.abs(num);

	        do {
	            int digit = temp % 10;
	            rev = rev * 10 + digit;
	            temp /= 10;
	        } while (temp > 0);

	        if (num < 0) rev = -rev;

	        System.out.println("Reversed number: " + rev);
	        sc.close();
	    }
	}



