public class MinPathSum {
    public int minSum(int[][] grid){
        if (grid.length == 0)
            return 0;

        int row = grid.length;
        int col = grid[0].length;

        int[][] rst = new int[row][col];
        for (int i = 0;i < row; i++)
            for (int j = 0; j < col; j++)
            {
                if (i == 0 && j == 0)
                    rst[i][j] = grid[i][j];
                if (i == 0 && j != 0)
                    rst[i][j] = rst[i][j-1] + grid[i][j];
                if (i !=0 && j== 0)
                    rst[i][j] = rst[i-1][j] + grid[i][j];
                if (i != 0 && j != 0)
                    rst[i][j] = Math.min(rst[i][j-1],rst[i-1][j])+grid[i][j];
            }
        return  rst[row-1][col-1];
    }

    public static void main(String[] args) {
        MinPathSum tt = new MinPathSum();

//        tt.minSum()
    }
}
