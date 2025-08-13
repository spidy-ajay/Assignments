package Assignment7;

import java.util.Random;
import java.util.Scanner;

public class Que_46 {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        int target = rand.nextInt(100) + 1; 
	        int guess;

	        do {
	            System.out.print("Guess the number (1-100): ");
	            guess = sc.nextInt();

	            if (guess < target) {
	                System.out.println("Too low.");
	            } else if (guess > target) {
	                System.out.println("Too high.");
	            } else {
	                System.out.println("Correct!");
	            }

	        } while (guess != target);
	    }
	}



