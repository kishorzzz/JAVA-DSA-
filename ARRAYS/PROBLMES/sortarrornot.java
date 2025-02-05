package ARRAYS.PROBLMES;

public class sortarrornot {
    public static void main(String[] args) {
        int[] arr={1,0,3,4,5};
        boolean sum=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                sum=false;
                break;
            }
        }
        System.out.println(sum);
    }
}
