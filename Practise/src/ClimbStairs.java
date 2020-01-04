public class ClimbStairs {
    public static int climbStairs(int n){
        int[] rst = new int[n];
//        if (n == 1)
//            return 1;
//        else if (n == 2){
//            return 2;
//        }
//        else {
//            rst = climbStairs(n-1)+climbStairs(n-2);
//        }

        for (int i = 0; i< n ; i++){
            if (i == 0)
                rst[0] = 1;
            else if (i == 1)
                rst[1] = 2;
            else {
                rst[i] = rst[i-1] +rst[i-2];
            }
        }
        return rst[n-1];
    }

    public static void main(String args[]){
        int rst = climbStairs(44);
        System.out.println(rst);
    }
}
