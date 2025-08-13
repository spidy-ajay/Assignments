package Assignment7;

import java.util.Scanner;

public class Que_20 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int temp = Math.abs(num);
	        int min = 9;

	        do {
	            int digit = temp % 10;
	            if (digit < min) {
	                min = digit;
	            }
	            temp /= 10;
	        } while (temp > 0);

	        System.out.println("Minimum digit: " + min);
	        sc.close();
	    }
	}



