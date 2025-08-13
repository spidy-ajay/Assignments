package Assignment7;

import java.util.Scanner;

public class Que_9 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        do {
	            System.out.println(n);
	            n--;
	        } while (n >= 1);
	        sc.close();
	    }
	}



