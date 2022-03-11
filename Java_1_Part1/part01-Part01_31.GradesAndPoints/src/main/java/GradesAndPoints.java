
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int point = Integer.valueOf(scan.nextLine());
        
        System.out.println("Grade: "); // empty line
        if (point < 0) {
            System.out.println("Impossible!");
        } else if (0 <= point && point <= 49) {
            System.out.println("Failed");
        } else if (50 <= point && point <= 59) {
            System.out.println("1");
        } else if (60 <= point && point <= 69) {
            System.out.println("2");
        } else if (70 <= point && point <= 79) {
            System.out.println("3");
        } else if (80 <= point && point <= 89) {
            System.out.println("4");
        } else if (90 <= point && point <= 100) {
            System.out.println("5");
        } else {
            System.out.println("Incredible!");
        }

    }
}
