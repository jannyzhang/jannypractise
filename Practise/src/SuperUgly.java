public class SuperUgly {
    public static int nthSuperUglyNumber(int n, int[] primes) {
        int[] idxs = new int[primes.length],dp = new int[n];//dp[i]由min{primes[j] * dp[idxs[j]]},j=[0,n)得到
        int i = 1;
        dp[0] = 1;
        while(i < n){
            int j = 0,min = Integer.MAX_VALUE;
            for(int num:primes){
                if(num * dp[idxs[j]] < min)
                    min = num * dp[idxs[j]];
                j++;
            }
            dp[i] = min;
            j = 0;
            for(int num:primes){
                if(min == num * dp[idxs[j]])
                    idxs[j]++;
                j++;
            }
            i++;
        }
        System.out.println(dp[dp.length -1]);
        return dp[dp.length - 1];
    }

    public static  void main(String args[]){
        int[] primes = {2,3,7,19,23,31};
        long startTime = System.currentTimeMillis();
        nthSuperUglyNumber(10,primes);
        long endTime = System.currentTimeMillis();
        System.out.println("Time cost:"+ (endTime - startTime));
    }

    public static void superugly2(int index,int[] primes){
        int[] dp = new int[index];
        dp[0] = 1;
        for (int i = 0;i<index;i++)
        {
            if(primes[i]*dp[i] <primes[i+1]){
                dp[i] = primes[i]*dp[i];
            }else {
                dp[i] = primes[i+1];

            }
        }
    }
}
