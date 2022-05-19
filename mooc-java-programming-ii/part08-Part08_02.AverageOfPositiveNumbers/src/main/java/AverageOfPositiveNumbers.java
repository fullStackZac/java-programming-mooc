import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        double average = 0.0;
        
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            if(input > 0) {
                numbers.add(input);
            }
        }
        if(numbers.isEmpty()) {
            System.out.println("Cannot calculate average");
        }else {
            for(int x: numbers) {
                sum += x;
            }
            average = (double)sum / numbers.size();
            System.out.println(average);
        }
    }
}
