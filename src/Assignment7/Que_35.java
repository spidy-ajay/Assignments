package Assignment7;

import java.util.Scanner;

public class Que_35 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number");
	        int number = sc.nextInt();
	        int rev = 0;
	        int temp = number;

	        while (temp > 0) {
	            rev = rev * 10 + temp % 10;
	            temp /= 10;
	        }

	        System.out.println("Reversed number: " + rev);
	        if (rev % 2 == 0)
	            System.out.println("Reversed number is even.");
	        else
	            System.out.println("Reversed number is odd.");
	    }
	}



