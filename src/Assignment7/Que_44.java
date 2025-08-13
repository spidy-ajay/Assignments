package Assignment7;
import java.util.Scanner;
public class Que_44 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int rows = sc.nextInt();
	        int i = 1;

	        do {
	            int j = 1;
	            do {
	                System.out.print("*");
	                j++;
	            } while (j <= i);
	            System.out.println();
	            i++;
	        } while (i <= rows);
	    }
	}



