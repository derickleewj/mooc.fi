
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // username recognition
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        
        // password recognition
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        
        // combination recognition
        String user1 = "alex";
        String password1 = "sunshine";
        String user2 = "emma";
        String password2 = "haskell";
        
        //
        
        if (username.equals(user1)) {
            if (password.equals(password1)) {
                System.out.println("You have successfully logged in!");
            } else System.out.println("Incorrect username or password!");    
        }
        
        if (username.equals(user2)) {
            if (password.equals(password2)) {
                System.out.println("You have successfully logged in!");
            } else System.out.println("Incorrect username or password!");
        }

    }
}
