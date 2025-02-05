package ARRAYS.PROBLMES;
import java.util.Scanner;
public class counteleocc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,3,3,3,3,31,1,13};
        int x=input.nextInt();
        // int occ=0;
        // for(int element:arr){
        //     if(element==x){
        //         occ++;
        //     }
        // }
        // System.out.println(occ);
        System.out.println(lastoccurence(arr, x));
        input.close();
    }
    static int lastoccurence(int[] arr,int key){
        int lastindex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                lastindex=i;
            }
        }
        return lastindex;
    }
}
