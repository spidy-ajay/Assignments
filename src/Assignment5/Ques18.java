package Assignment5;

import java.util.Scanner;

public class Ques18 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Input number of terms: ");
	        int terms = sc.nextInt();

	        
	        for (int i = 1; i <= terms; i++) {
	            int cube = i * i * i;
	            System.out.println(i + " Number is : " + i + " and cube of " + i + " is : " + cube);
	        }

	     
	    }
	}


