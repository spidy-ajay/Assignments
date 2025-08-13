package Assignment6;

import java.util.Scanner;

public class Ques14{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    
    
    if (number == 0) {
        System.out.println("Number of digits: 1");
    } else {
        int count = 0;
        int temp = number;
        
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        
        System.out.println("Number of digits: " + count);
    }
    
}
}


