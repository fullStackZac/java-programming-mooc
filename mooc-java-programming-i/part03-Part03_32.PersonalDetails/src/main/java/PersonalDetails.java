
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int yearSum = 0;
        String longestName = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] pieces = input.split(",");
            if (pieces[0].length() > longestName.length()) {
                longestName = pieces[0];
            }
            int birthYear = Integer.valueOf(pieces[1]);
            count++;
            yearSum += birthYear;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((double)yearSum / count));
    }
}
