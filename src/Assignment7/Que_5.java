package Assignment7;

import java.util.Scanner;

public class Que_5 {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        int i = 1;
	        do {
	            System.out.println(i + "^2 = " + (i * i));
	            i++;
	        } while (i <= n);
	        sc.close();
	    }
	}



