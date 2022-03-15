
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    while (true) {
        String input = scanner.nextLine();
        if (input.equals("")) {
            return;
        }
        
        String [] split = input.split(" ");
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (word.contains("av")) {
                System.out.println(word);
            }
        }
    }


    }
}
