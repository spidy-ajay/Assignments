package Assignment7;

import java.util.Scanner;

public class Que_19 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int max = 0;
	        int temp = Math.abs(num);

	        do {
	            int digit = temp % 10;
	            if (digit > max) {
	                max = digit;
	            }
	            temp /= 10;
	        } while (temp > 0);

	        System.out.println("Maximum digit: " + max);
	        sc.close();
	    }
	}



