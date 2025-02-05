package ARRAYS.ACCESSING;
import java.util.Arrays;

public class foreach {
    public static void main(String[] args) {
        // Here the integer is Object 
        // if the array is int[] -> then it is the array of integer elements
        Integer[] arr={1,2,3,4,5};
        Arrays.asList(arr).forEach(element->System.out.println(element));
    }
}
