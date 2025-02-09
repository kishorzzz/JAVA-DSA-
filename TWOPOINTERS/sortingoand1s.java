package ARRAYS.TWOPOINTERS;

import java.util.Arrays;

public class sortingoand1s {
    public static void main(String[] args) {
        int[] arr={1,0,1,0,1,0};
        int[] newarr=new int[arr.length];
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                newarr[i]=0;
            }
            else{
                newarr[i]=1;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
