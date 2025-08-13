package Assignment7;

import java.util.Scanner;

public class Que_41 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 1;
	        int term = 2;

	        do {
	            System.out.print(term + " ");
	            term *= 2;
	            i++;
	        } while (i <= n);
	    }
	}

	


