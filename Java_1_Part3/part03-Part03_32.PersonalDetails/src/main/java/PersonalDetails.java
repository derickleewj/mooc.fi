
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfYear = 0;
        int inputCount = 0;
        int i = 0; // To serve as benchmark for measuring name length
        int longestName = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            // Adding sum of birth years
            String [] split = input.split(",");
            int n = Integer.valueOf(split[1]);
            sumOfYear += n;
            inputCount++;
            
            // Finding longest name
            longestName = split[0].length();
            if (i < longestName) {
                i = longestName;
                name = split[0];
            }
            
        } // While ends
        
        System.out.println("Longest name:" + name);
        System.out.println("Average of the birth years: " + ((1.0 * sumOfYear)/inputCount));


    }
}
