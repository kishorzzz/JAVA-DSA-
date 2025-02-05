package ARRAYS.METHODS.INTEGER_ARRAY;
import java.util.Arrays;

public class copofrange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] newarr=Arrays.copyOfRange(arr, 1, 7);
        System.out.println(Arrays.toString(newarr));
    }
}
