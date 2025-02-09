package ARRAYS.TWOPOINTERS;

import java.util.Arrays;

public class sorting0and1enhacned {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,1,0,1};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                Swappingthearray(arr,left,right);
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void Swappingthearray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
