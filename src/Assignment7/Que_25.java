package Assignment7;

import java.util.Scanner;

public class Que_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;
        int sum = 0;
        int count = 0;

        do {
            System.out.print("Enter marks (enter 1 to stop): ");
            marks = sc.nextInt();
            if (marks != 1) {
                sum += marks;
                count++;
            }
        } while (marks != 1);

        if (count > 0) {
            double avg = (double) sum / count;
            System.out.println("Average marks: " + avg);
        } else {
            System.out.println("No marks entered.");
        }

        sc.close();
    }
}



