
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    while(true) {
        String input = scanner.nextLine();
        if (input.equals("")) {
            return;
        }
            
        String [] split = input.split(" ");
        int i = split.length;
        String lastWord = split[i - 1];
        System.out.println(lastWord);
        }
        
    }
}
