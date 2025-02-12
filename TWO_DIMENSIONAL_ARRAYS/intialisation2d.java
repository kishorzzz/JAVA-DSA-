package TWO_DIMENSIONAL_ARRAYS;
import java.util.Scanner;
// import java.util.Arrays;1 2
public class intialisation2d {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int[][] arr=new int[3][4];
        System.out.println("enter " + 3*4 +"values :" );
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("]");
        }
        input.close();
    }
}
