package Assignment7;

import java.util.Scanner;

public class Que_10  {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number for table: ");
	        int num = sc.nextInt();
	        int i = 1;
	        do {
	            System.out.println(num + " x " + i + " = " + (num * i));
	            i++;
	        } while (i <= 10);
	        sc.close();
	    }
	}



