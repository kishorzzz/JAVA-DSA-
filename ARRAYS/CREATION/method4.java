package ARRAYS.CREATION;

public class method4 {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        int sum=0;
        for(int i =0;i<=arr.length;i++){
            sum+=i;
        }
        System.out.println(arr.length);
        System.out.println(sum);
    }
}
