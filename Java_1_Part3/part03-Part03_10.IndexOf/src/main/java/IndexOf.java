
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        System.out.println("Search for?");
        int user = Integer.valueOf(scanner.next());
        
        for (int i = 0; i < list.size(); i++) {
            int position = list.get(i);
            if (user == position) {
                System.out.println(user + " is at index " + i);
            }
        }
    }
}
