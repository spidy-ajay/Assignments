package Assignment7;

import java.util.Scanner;

public class Que_18 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int product = 1;
	        int temp = Math.abs(num);

	        if (temp == 0) product = 0;
	        else {
	            do {
	                product *= temp % 10;
	                temp /= 10;
	            } while (temp > 0);
	        }

	        System.out.println("Product of digits: " + product);
	        sc.close();
	    }
	}



