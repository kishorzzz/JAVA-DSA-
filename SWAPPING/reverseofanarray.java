package ARRAYS.SWAPPING;
import java.util.Arrays;
public class reverseofanarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] newarr= new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            newarr[j++]=arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
