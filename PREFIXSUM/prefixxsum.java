package ARRAYS.PREFIXSUM;

import java.util.Arrays;

public class prefixxsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] prefixedsum=new int[arr.length];
        prefixedsum=prefixxedsum(arr);
        System.out.println(Arrays.toString(prefixedsum));
    }
    static int[] prefixxedsum(int[] arr){
        int[] newarr=new int[arr.length];
        newarr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            newarr[i]=newarr[i-1]+arr[i];
        }
        return newarr;
    }
} 
