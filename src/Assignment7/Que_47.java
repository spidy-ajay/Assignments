package Assignment7;

import java.util.Random;

public class Que_47 {
	
	    public static void main(String[] args) {
	        Random rand = new Random();
	        int headsCount = 0;

	        do {
	            int flip = rand.nextInt(2); // 0 = Tails, 1 = Heads
	            if (flip == 1) {
	                System.out.println("Heads");
	                headsCount++;
	            } else {
	                System.out.println("Tails");
	            }
	        } while (headsCount < 3);
	    }
	}



