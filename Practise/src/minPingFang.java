public class minPingFang {
    public static void main(String[] args) {
        minPingFang p = new minPingFang();
        int rst = p.numSquares(48);
        System.out.println(rst);
    }
    public int numSquares(int n) {

//        int[] rst = new int[n];
//        for (int i = 0; i < n ; i++) {
//            if (i < 3)
//                rst[i] = i + 1;
//
//
//
//
//        }

        if (n <= 3)
            return n;
        else {
            int x1 = (int) Math.sqrt(n);
            int x2 = x1-1;
            int tt = n/(x2*x2);
            int x3 = x2-1;
            int t3=0;
            if (x3 != 0) {
                t3 = n / (x3 * x3);
                return Math.min(1 + numSquares(n - x1 * x1), Math.min(tt + numSquares(n - x2 * x2 * tt), t3 + numSquares(n - x3 * x3 * t3)));
            }
            else {
                return Math.min(1 + numSquares(n - x1 * x1), tt + numSquares(n - x2 * x2 * tt));
            }
        }
    }
}
