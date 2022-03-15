
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String [] split = input.split(",");
            int n = Integer.valueOf(split[1]);
            if (n > oldest) {
                oldest = n;
                name = split[0];
            }
            
            System.out.println("Name of the oldest: " + name);
            
        } // While ends


    }
}
