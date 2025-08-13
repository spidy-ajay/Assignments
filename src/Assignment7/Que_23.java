package Assignment7;

import java.util.Scanner;

public class Que_23 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String user;

	        do {
	            System.out.print("Enter username: ");
	            user = sc.next();
	        } while (!user.equals("Ajay"));

	        System.out.println("Access granted.");
	        sc.close();
	    }
	}



