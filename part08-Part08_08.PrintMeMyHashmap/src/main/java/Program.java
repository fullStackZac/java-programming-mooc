
import java.util.HashMap;

public class Program {
    
    public static void printKeys(HashMap<String,String> hashmap) {
        for(String a : hashmap.keySet()) {
            System.out.println(a);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String a : hashmap.keySet()) {
            if(a.contains(text)) {
                System.out.println(a);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String a : hashmap.keySet()) {
            if(a.contains(text)) {
                System.out.println(hashmap.get(a));
            }
        }
    }
    
    public static void main(String[] args) {
        // Test your program here!
    }

}
