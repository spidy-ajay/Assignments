package Assignment6;

import java.util.Scanner;

public class Ques17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers: ");
		
        int number = sc.nextInt();

        int reversed = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;   
            reversed = reversed * 10 + digit; 
            temp = temp / 10;           
        }

       
       if(number>0) {
    	   reversed=reversed;
       }

       System.out.println(reversed);
   
	}

}
