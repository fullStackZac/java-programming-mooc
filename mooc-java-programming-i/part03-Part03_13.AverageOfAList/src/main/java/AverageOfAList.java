
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        int sum = 0;
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1) {
                break;
            }
            list.add(input);
        }
        for(int element: list) {
            count++;
            sum += element;
        }
        System.out.println("Average: " + (sum / (double)count));
    }
}
