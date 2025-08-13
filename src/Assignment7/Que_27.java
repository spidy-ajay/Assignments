package Assignment7;

import java.util.Scanner;

public class Que_27 {
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number;

	        do {
	            System.out.print("Enter a number: ");
	            number = sc.nextInt();
	        } while (!isPrime(number));

	        System.out.println(number + " is a prime number.");
	        sc.close();
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= num / 2; i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}



