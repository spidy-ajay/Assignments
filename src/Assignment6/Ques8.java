package Assignment6;

import java.util.Scanner;

public class Ques8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range to want a cube ");
		int no=sc.nextInt();
		
	 	int i=1;	
		
		
		while(i <= no) {
			System.out.println(i*i*i);
			i++;
			   
			
		}
	}

}
