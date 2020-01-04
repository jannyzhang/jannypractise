import java.util.ArrayList;
import java.util.List;

public class Matrix {
    public static void matrixClockwise(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] rst = new int[m][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                rst[j][n-1-i] = matrix[i][j];
        System.out.println("旋转后：");
        for (int i = 0;i < rst.length; i++) {
            for (int j = 0; j < rst[0].length; j++)
                System.out.print(rst[i][j]+",");
            System.out.println();
        }
    }

    public static void matrixCounterClockwise(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] rst = new int[m][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                rst[m-1-j][i] = matrix[i][j];
        System.out.println("旋转后：");
        for (int i = 0;i < rst.length; i++) {
            for (int j = 0; j < rst[0].length; j++)
                System.out.print(rst[i][j]+",");
            System.out.println();
        }
    }

    public static void matrixTranspose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] rst = new int[m][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++){
                rst[j][i] = matrix[i][j];
            }
        System.out.println("转置后：");
        for (int i = 0;i < rst.length; i++) {
            for (int j = 0; j < rst[0].length; j++)
                System.out.print(rst[i][j]+",");
            System.out.println();
        }
    }

    public static List<Integer>  spiralOrder(int[][] matrix) {
        List<Integer> rst = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        if(n == 0)
            return rst;
        int c = (Math.min(n,m)-1)/2+1;
        for (int i = 0; i < c ;i++){
            for (int j = i;j < m - i&& rst.size() < n*m ; j++) {
                rst.add(matrix[i][j]);
            }
            for (int j = i+1;j< n - i&& rst.size() < n*m ;j++){
                rst.add(matrix[j][m-1-i]);
            }
            for (int j = m - i - 2; j >=i&& rst.size() < n*m; j--) {
                rst.add(matrix[n - i - 1][j]);
            }
            for (int j = n - i - 2; j > i&& rst.size() < n*m; j--) {
                rst.add(matrix[j][i]);
            }
        }
        return rst;
    }
    public static void main(String args[]){
        int[][] matrix = new int[0][0];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = 5*i+j;
            }
        for (int i = 0;i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++)
                System.out.print(matrix[i][j]+",");
            System.out.println();
        }
        System.out.println();
//        matrixClockwise(matrix);
//        matrixCounterClockwise(matrix);
//        matrixTranspose(matrix);
        spiralOrder(matrix);
    }

}
