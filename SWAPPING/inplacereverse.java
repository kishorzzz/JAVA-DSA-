package ARRAYS.SWAPPING;

import java.util.Arrays;

public class inplacereverse {
    public static void main(String[] args) {
        String[] arr={"kishor","nithin","Rushitha","jayasri"};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            reversingarray(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void  reversingarray(String[] arr,int i,int j){
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
