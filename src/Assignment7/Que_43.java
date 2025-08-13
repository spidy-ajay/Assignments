package Assignment7;
import java.util.Scanner;
public class Que_43 {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int a = 0, b = 1, c = 1, count = 1;
	        do {
	            System.out.print(a + " ");
	            int next = a + b + c;
	            a = b;
	            b = c;
	            c = next;
	            count++;
	        } while (count <= n);
	    }
	}



