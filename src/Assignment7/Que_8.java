package Assignment7;

import java.util.Scanner;

public class Que_8 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        int i = 1;
	        do {
	            if (i % 5 != 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= n);
	        sc.close();
	    }
	}



