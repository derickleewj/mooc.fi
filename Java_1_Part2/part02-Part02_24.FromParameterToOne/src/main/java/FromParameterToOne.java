
import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        printFromNumberToOne(number);

    }
    
    public static void printFromNumberToOne (int number) {
        int numberToPrint = number;
        while (numberToPrint >= 1) {
            System.out.println(numberToPrint--);
        }
    }
}
