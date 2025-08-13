package Assignment5;
import java.util.Scanner;

public class Ques14 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter a positive integer: ");
	        int num = sc.nextInt();

	        long factorial = 1;

	       
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	                System.out.println("factorial of "+num+"is:"+factorial);
	            
	            

	        }
	    }

