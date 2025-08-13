package Assignment7;

import java.util.Scanner;

public class Que_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Ajay@2004";
        String input;
        int attempt= 0;

        do {
            System.out.print("Enter password: ");
            input = sc.next();
            attempt++;

            if (input.equals(correctPassword)) {
                System.out.println("Succesfully entered");
                break;
            } else {
                System.out.println("Incorrect password.");
            }
        } while (attempt<3);

        if (!input.equals(correctPassword)) {
            System.out.println("plzz try Again");
        }

       
    }
}



