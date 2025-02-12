package TWO_DIMENSIONAL_ARRAYS;

public class additionofmatrices {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] b={{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        int[][] sum=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(sum[i][j]+" ");
            }
        }
    }
}
