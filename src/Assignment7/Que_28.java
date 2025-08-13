package Assignment7;

import java.util.Scanner;

public class Que_28  {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int age;

	        do {
	            System.out.print("Enter a valid age (1-120): ");
	            age = sc.nextInt();
	        } while (age < 1 || age > 120);

	        System.out.println("Age accepted: " + age);
	        sc.close();
	    }
	}



