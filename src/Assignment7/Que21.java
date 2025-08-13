package Assignment7;

import java.util.Scanner;

public class Que21  {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int number;

		        do {
		            System.out.print("Enter a positive number: ");
		            number = sc.nextInt();
		        } while (!(number >= 0));

		        System.out.println("Your number: " + number);
		        sc.close();
		    }
		

	}


