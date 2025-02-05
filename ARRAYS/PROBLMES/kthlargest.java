package ARRAYS.PROBLMES;

public class kthlargest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int maxi=largestnumber(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==maxi){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondlargest=largestnumber(arr);
        System.out.println("The Second largest number is :");
        System.out.println(secondlargest);
    }
    static int largestnumber(int[] arr){
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
}
