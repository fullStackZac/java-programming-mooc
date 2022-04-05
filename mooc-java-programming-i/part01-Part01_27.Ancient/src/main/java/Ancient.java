
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a yeaer:");
        int a = Integer.valueOf(scan.nextLine());
        if(a < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
