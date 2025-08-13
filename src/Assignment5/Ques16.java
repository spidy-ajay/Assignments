package Assignment5;

import java.util.Scanner;

public class Ques16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		int reverse=0;
		
		for(int i = 0;num!=0;i++) {
			int d = num % 10;
			reverse = reverse * 10 + d;
			num = num /10;
		}
		System.out.println(reverse);
	}

}
