package ARRAYS.PROBLMES;

import java.util.Arrays;
import java.util.Scanner;

public class smallandlarg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={
            1,2,3,4,5,6
        };
        System.out.println("Enter the Kth Sequence : ");
        int k=input.nextInt();
        int[] result=smallandlargest(arr,k);
        for(int element:result){
            System.out.print(element+" ");
        }
        input.close();
    }
    static int[] smallandlargest(int[] arr,int key){
        Arrays.sort(arr);
        return  new int[]{arr[key-1],arr[arr.length-key]};
        
    }
}
