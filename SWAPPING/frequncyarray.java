package ARRAYS.SWAPPING;
// import java.util.Arrays;
import java.util.Scanner;
public class frequncyarray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]  arr={1,2,3,4,5,6};
        int[] freqarr=frequenctyarr(arr);
        System.out.println("Enter the freqauency to run");
        int q=input.nextInt();
        while(q>0){
            System.out.print ("Enter element to be Searched : ");
            int key=input.nextInt();
            if(freqarr[key]>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }
        input.close();
    }
    static int[] frequenctyarr(int[] arr){
        int[] newarr=new int[100005];
        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }
        return newarr;
    }
}
