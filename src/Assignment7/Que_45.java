package Assignment7;
import java.util.Scanner;
public class Que_45 {


 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int rows = sc.nextInt();
	        int i = 1;

	        do {
	            int j = 1;
	            do {
	                if (j <= i)
	                    System.out.print(j + " ");
	                j++;
	            } while (j <= rows);
	            System.out.println();
	            i++;
	        } while (i <= rows);
	    }
	

}
