package Assignment6;

import java.util.Scanner;

public class Ques10 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of no:- ");
		int n=sc.nextInt();
		
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			
			i++;
		}
	}		

}
