package ARRAYS.PROBLMES;

public class threesum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=10;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
