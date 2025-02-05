package ARRAYS.METHODS.STRING_ARRAY;
import java.util.Arrays;

public class clone {
    public static void main(String[] args) {
        String[] arr={"kishor","java","dsa"};
        String[] newarr=arr.clone();
        System.out.print(Arrays.toString(newarr));
    }
}
