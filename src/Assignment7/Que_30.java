package Assignment7;

import java.util.Random;

public class Que_30 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number;

        do {
            number = rand.nextInt(100) + 1; 
            System.out.println("Generated: " + number);
        } while (number % 7 != 0);

        System.out.println("Found number divisible by 7: " + number);
    }
}



