package Assignment7;

import java.util.Scanner;

public class Que_15 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int sum = 0;
	        int temp = Math.abs(num);

	        do {
	            sum += temp % 10;
	            temp /= 10;
	        } while (temp > 0);

	        System.out.println("Sum of digits: " + sum);
	        sc.close();
	    }
	}


