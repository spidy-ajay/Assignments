package Assignment5;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number you want to table of it :-");
		
		int a=sc.nextInt();
		System.out.println(a);
		
		for(int i=a;i<=10;i++) {
			System.out.println(i*a);
		}
	}

}
