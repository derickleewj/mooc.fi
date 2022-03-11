
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());
        
        System.out.println(""); // empty line
        if (number < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
