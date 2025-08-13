package Assignment7;

import java.util.Scanner;

public class Que_11 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int sum = 0, i = 1;
	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        do {
	            sum += i;
	            i++;
	        } while (i <= n);

	        System.out.println("Sum = " + sum);
	        sc.close();
	    }
	}



