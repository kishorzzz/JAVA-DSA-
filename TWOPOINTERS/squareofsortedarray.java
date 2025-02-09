package ARRAYS.TWOPOINTERS;

import java.util.Arrays;

public class squareofsortedarray {
    public static void main(String[] args) {
        int[] arr={-13,-10,2,4,7,8,9,12};
        int[] newarr=new int[arr.length];
        int start=0;
        int end=arr.length-1;
        int k=0;
        while(start<end){
            if(Math.abs(arr[start])>Math.abs(arr[end])){
                newarr[k++]=arr[start]*arr[start];
                start++;
            }
            else{
                newarr[k++]=arr[end]*arr[end];
                end--;
            }
        }
        reversingarray(newarr);
        System.out.println(Arrays.toString(newarr));
    }
    static void reversingarray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swappingarray(arr,i,j);
            i++;
            j--;
        }
    }
    static void swappingarray(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
