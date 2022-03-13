
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        // contains functionality begins here
        
        System.out.println("Search for?");
        String input2 = scanner.nextLine();
        
        if (list.contains (input2)) {
            System.out.println(input2 + " was found!");
        }   else {
            System.out.println(input2 + " was not found!");
            }
        }

    }
