package Assignment7;

import java.util.Random;
import java.util.Scanner;

public class Que_48 {
	
	    public static void main(String[] args) {
	        Random rand = new Random();
	        int sum = 0;

	        do {
	            int num = rand.nextInt(20) + 1;
	            sum += num;
	            System.out.println("Generated: " + num + " | Sum: " + sum);
	        } while (sum <= 100);
	    }
	}
