
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
    
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        
        System.out.println("The numbers in the range " + "[" + lowerLimit + ", " + upperLimit + "]");
        
        for (int number: list) {
            if ((number > lowerLimit) && (number < upperLimit)) {
                System.out.println(number);
            }

        }
    }
    }
    
