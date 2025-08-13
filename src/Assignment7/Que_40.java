package Assignment7;

import java.util.Scanner;

public class Que_40 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Digits");
	        int number = sc.nextInt();
	        int even = 0, odd = 0;

	        do {
	            int digit = number % 10;
	            if (digit % 2 == 0)
	                even++;
	            else
	                odd++;
	            number /= 10;
	        } while (number > 0);

	        if (even > odd)
	            System.out.println("More even digits.");
	        else if (odd > even)
	            System.out.println("More odd digits.");
	        else
	            System.out.println("Equal even and odd digits.");
	    }
	}


