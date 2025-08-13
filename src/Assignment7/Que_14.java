package Assignment7;

import java.util.Scanner;

public class Que_14 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        int count = 0;
	        int temp = Math.abs(num);

	        do {
	            temp /= 10;
	            count++;
	        } while (temp > 0);

	        System.out.println("Number of digits: " + count);
	        sc.close();
	    }
	}



