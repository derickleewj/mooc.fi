
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // variable for tracking count
        int count = 0;
        // variable for tracking sum
        int total = 0;
        
        // loop begins here
        while (true) {
            // user input
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            // conditions start here
            if (input == 0) {
                break;
            } else if (input !=0) {
                total += input;
                count = count + 1;         
            }
        }
        System.out.println("Number of numbers:" + count);
        System.out.println("Sum of the numbers:" + total);
    }
}