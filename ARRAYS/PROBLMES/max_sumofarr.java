package ARRAYS.PROBLMES;

public class max_sumofarr {
    public static void main(String[] args) {
        int[] arr={1,5,3};
        int curr=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>curr){
                curr=arr[i];
            }
        }
        System.out.println(curr);
    }
}
