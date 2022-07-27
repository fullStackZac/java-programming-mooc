import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfNumbers {

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
        double average = values.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        System.out.println("Average of the numbers: " + average);
    }
}
