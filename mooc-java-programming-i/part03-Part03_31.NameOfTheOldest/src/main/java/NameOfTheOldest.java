
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                oldestName = pieces[0];
                oldest = age;
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
