
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
                   
        // user input beginning prompt
            System.out.println("From where?");
            int usercount1 = Integer.valueOf(scanner.nextLine());            
        
        // user input end prompt
            System.out.println("To where?");
            int usercount2 = Integer.valueOf(scanner.nextLine());

        System.out.println(numbers.get(usercount1));
        System.out.println(numbers.get(usercount2));
        
        }

    }
