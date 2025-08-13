package Assignment7;

import java.util.Scanner;

public class Que_37 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();

	        int divisor = 1;
	        while (number / divisor >= 10) {
	            divisor *= 10;
	        }

	        do {
	            int digit = number / divisor;
	            System.out.print(digit + " ");
	            number %= divisor;
	            divisor /= 10;
	        } while (divisor > 0);
	    }
	}



