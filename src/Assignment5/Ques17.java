package Assignment5;

import java.util.Scanner;

public class Ques17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr a number :-");
		int num=sc.nextInt();
		
		int original=num;
		int reversed=0;
		
		
		 for (int i = 1; num != 0;i++) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
			num = num / 10;
		}
		if(original==reversed) {
			System.out.println("given number is pallindrome");
		}
		else {
			System.out.println("given number is not pallindrome");
		}
	}

}
