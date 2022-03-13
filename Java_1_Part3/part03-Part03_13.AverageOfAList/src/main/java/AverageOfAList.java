
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        
        ArrayList<Integer> userList = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            userList.add(input);
        }
       
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        double avg = 0.0;
        int sum = 0;
        int index = userList.size();
        
        for (int i: userList) {
            sum += i;
            avg = 1.0 * sum / index;
        }
        
        System.out.println("Average: " + avg);
        
    }
}
