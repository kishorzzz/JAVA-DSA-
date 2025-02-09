package ARRAYS.TWOPOINTERS;

import java.util.Arrays;

public class oddandeven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]%2!=0 && arr[j]%2==0){
                swappinngarray(arr,i,j);
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swappinngarray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
