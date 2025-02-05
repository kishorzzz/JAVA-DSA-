package ARRAYS.PROBLMES;

public class searching {
    public static void main(String[] args) {
        int[] arr={1,4,5};
        int key=4;
        int sum=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                sum=1;
                break;
            }
        }
        System.out.println(sum);
    }
}
