package Assignment7;

import java.util.Scanner;

public class Que_16 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();

	        long fact = 1;
	        int i = 1;

	        do {
	            fact *= i;
	            i++;
	        } while (i <= num);

	        System.out.println("Factorial = " + fact);
	        sc.close();
	    }
	


}
