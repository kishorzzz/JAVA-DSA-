package ARRAYS.METHODS.INTEGER_ARRAY;
import java.util.Arrays;

public class copyof {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7};
        //out of length in an array prints with default value that is Zero 
        int[] copyarr=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(copyarr));
    }
}
