
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checker = 0;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while(scanFile.hasNextLine()) {
                String current = scanFile.nextLine();
                if(current.equals(searchedFor)) {
                    System.out.println("Found!");
                    checker = 1;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }
        if (checker == 0) {
            System.out.println("Not found.");
        }
    }
}
