package ARRAYS.PROBLMES;
// import java.util.Arrays;
public class arraycoping {
    public static void main(String[] args) {
        int[] arr={1,3,5};
        System.out.println("Org Array");
        for(int element:arr){
            System.out.print(element+" ");
            // copyyyarr(arr);
            // System.out.print(copyarr(arr));
        }
        copyyyarr(arr);
        // Arrays.asList(arr).forEach(element->System.out.println(element));
    //     System.out.println(arr.toString());
    }
    static void copyyyarr(int[] arr){
        int[] arr2=arr;
        // for(int)
        System.out.println("Copied Array");
        for(int ele:arr2){
            System.out.print(ele+" ");
            // copyyyarr(arr);
            // System.out.print(copyarr(arr));
        }
    }
}
