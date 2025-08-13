package Assignment5;

import java.util.Scanner;

public class Ques4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to u want a table");
		int a=sc.nextInt();
		System.out.println(a);
		
		for(int i=10;i>=2;i--) {
			System.out.println(i*a);
			
		}
	}

}
