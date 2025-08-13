package Assignment7;

import java.util.Scanner;

public class Que_6 {
 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();
	        int i = 1;
	        do {
	            System.out.println(i + "^3 = " + (i * i * i));
	            i++;
	        } while (i <= n);
	        sc.close();
	    }
	}



