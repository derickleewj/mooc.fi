
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variable for tracking count
        double count = 0;
        //variable for average
        double average = 0;
        //variable for total
        double total = 0;
        
        // loop begins here
        while (true) {
            // user input
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            
            // conditions start here
            if (input == 0) {
                break;
            } else if (input !=0) {
                total += input;
                count = count + 1;         
                average = total / count;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}

