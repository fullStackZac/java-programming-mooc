import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array) {
        
        if (array.length == 0) {
            return 0;
        }

        int smallest = array[0];
        
        for (int e : array) {
            if (e < smallest) {
                smallest = e;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {

        int min = table[startIndex];
        int index = 0;
        
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] <= min) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
       
        System.out.print("Before sort:");
        System.out.println(Arrays.toString(array));
        
        for(int i = 0; i < array.length; i++) {
            swap(array,i , indexOfSmallestFrom(array, i));
            System.out.println("After first sort " + Arrays.toString(array));
        }
    }
}
