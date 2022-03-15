
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } 
            
            String [] split = input.split(",");
            int n = Integer.valueOf(split[1]);
            if (n > oldest) {
                oldest = n;
            } // While ends
        }
        System.out.println("Age of the oldest:" + oldest);


    }
}
