
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        
    }
    
    // Try your method here
    
    public static int sum(ArrayList<Integer> numbers) {
        if(numbers.size() == 0) {
            return -1;
        }
        
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        
        return sum;
    }

}
