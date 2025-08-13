package Assignment7;

import java.util.Scanner;

public class Que_13 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int sum = 0, i = 1;
	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        do {
	            sum += i;
	            i += 2;
	        } while (i <= n);

	        System.out.println("Sum of odd numbers = " + sum);
	        sc.close();
	    }
	}

