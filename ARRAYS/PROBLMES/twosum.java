package ARRAYS.PROBLMES;

// import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int target=7;
        System.out.println(twosumming(arr, target));
        // int[][] result=twosumming(arr,target);
        // System.out.println(Arrays.deepToString(result));
    }
    static int twosumming(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                    // return new int[][]{{arr[i],arr[j]}};
                }
            }
        }
        return count;
        // return new int[0][0];
    }
    
}
