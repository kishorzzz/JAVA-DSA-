package ARRAYS.SWAPPING;

public class temporaryswap {
    public static void main(String[] args) {
        int a=6;
        int b=7;
        Swapping(a,b);
       
    }
    static void Swapping(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
