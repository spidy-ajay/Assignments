package Assignment7;
import java.util.Scanner;
public class Que_42 {


	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 1;
	        double sum = 0;

	        do {
	            sum += 1.0 / i;
	            i++;
	        } while (i <= n);

	        System.out.println("Sum = " + sum);
	    }
	}



