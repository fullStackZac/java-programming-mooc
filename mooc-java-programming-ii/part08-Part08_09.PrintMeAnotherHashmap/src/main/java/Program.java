
import java.util.HashMap;

public class Program {
    
    public static void printValues(HashMap<String,Book> hashmap) {
        for(Book a : hashmap.values()) {
            System.out.println(a.toString());
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for(Book x : hashmap.values()) {
            if(x.getName().contains(text)) {
                System.out.println(x.toString());
            }
        }
    }
    
    public static void main(String[] args) {
        // Test your program here!
    }

}
