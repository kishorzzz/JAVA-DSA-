package ARRAYS.SWAPPING;
import java.util.Arrays;
import java.util.Scanner;
public class rotatingenhanced {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("Enter the Kth term for ratation :");
        int k=input.nextInt();
        k=k%arr.length;
        rotationofarr(arr,0,k-1);
        rotationofarr(arr,k,arr.length-1);
        rotationofarr(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        input.close();
    }
    static void rotationofarr(int[] arr,int i,int j){
        // int i=0;
        // int j=arr.length-1;
        while(i<j){
            swappthearr(arr,i,j);
            i++;
            j--;
        }
    }
    static void swappthearr(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
