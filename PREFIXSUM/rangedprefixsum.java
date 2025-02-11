package ARRAYS.PREFIXSUM;

import java.util.Arrays;

public class rangedprefixsum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(prefixxedsum(arr, 1, 3));

    }
    static int prefixxedsum(int[] arr,int left , int right){
        int[] newarr=new int[arr.length+1];
        newarr[0]=0;
        for(int i=1;i<=arr.length;i++){
            newarr[i]=newarr[i-1]+arr[i-1];
        }
        System.out.println(Arrays.toString(newarr));
        return newarr[right]-newarr[left-1];
    }
}
