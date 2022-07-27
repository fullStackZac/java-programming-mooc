
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> values = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            
            if(input.equals("end")) {
                break;
            }
            values.add(input);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        if(choice.equals("n")) {
            double negativeAverage = values.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + negativeAverage);
        }else {
            double positiveAverage = values.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the  positive numbers: " + positiveAverage);
        }
    }
}
