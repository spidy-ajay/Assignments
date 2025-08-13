package Assignment7;

import java.util.Scanner;

public class Que_24 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Hello");
	            System.out.println("2. Bye");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            
	            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
     

	           
	        } while (choice != 3);

	        
	    }
	}



