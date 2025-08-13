package Assignment7;

import java.util.Random;

public class Que_50 {

	    public static void main(String[] args) {
	        Random rad = new Random();
	        int roll;

	        do {
	            roll = rad.nextInt(6) + 1;
	            System.out.println("Rolled: " + roll);
	        } while (roll != 6);

	        System.out.println("You rolled a 6!");
	    }
	}


