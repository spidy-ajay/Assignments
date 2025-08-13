package Assignment6;

import java.util.Scanner;

public class Ques11 {
public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        int i = 1;
	        int sum = 0;

	        while (i <= n) {
	            sum += i;
	            i++;
	        }

	        System.out.println("Sum from 1 to " + n + " is: " + sum);

	       
	    }
	


}
