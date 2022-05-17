
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int amount = 0;
        int moveAmount = 0;
        String command = "";


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            command = parts[0];
            amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                if(amount >= 0) {
                    first = first + amount;
                    if(first >= 100) {
                        first = 100;
                    }
                }
            }
            
            if(command.equals("move")) {
                if(first > 0 && amount >= 0){
                    if(amount >= first) {
                        second = second + first;
                        first = 0;
                    }
                    if(first > amount) {
                        second = second + amount;
                        first = first - amount;
                    }
                    if(second >= 100) {
                        second = 100;
                    }
                }
            }
            
            if(command.equals("remove")) {
                if(second > 0 && amount >= 0) {
                    if(amount >= second) {
                        second = 0;
                    }else {
                        second = second - amount;
                    }
                }
            }
        }
    }

}
