package Assignment7;

import java.util.Scanner;

public class Que_22  {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int number;

	        do {
	            System.out.print("Enter a number greater than 100: ");
	            number = sc.nextInt();
	        } while (number <= 100);

	        System.out.println("Accepted: " + number);
	        sc.close();
	    }
	}



