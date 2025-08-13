package Assignment5;

import java.util.Scanner;

public class Ques15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base number :");
		int base=sc.nextInt();
		
		System.out.println("Enter the exponent");
		int power=sc.nextInt();
		
		int result=1;
		
		for(int i=1;i<=power;i++) {
			result*=base;
		}
		System.out.println(base+" raised to the power of "+ power +" is "+result);
	}

}
