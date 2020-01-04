import java.util.ArrayList;
import java.util.List;

public class Primes {
    public static int countPrimes(int n){
        int counter = 2;
        List<Integer> rst = new ArrayList<>();
        if (n == 1)
            return 0;
        if (n == 2) {
            rst.add(2);
            return 1;
        }
        if (n == 3) {
            rst.add(2);
            rst.add(3);
            return 2;
        }
        rst.add(2);
        rst.add(3);
        int temp = 0;
        for (int i = 4; i<= n; i++){
            for (int j = 2; j <= Math.sqrt(i)+1;j++){
                if (i%j == 0){
                    temp = 1;
                    break;
                }
            }
            if (temp == 0){
                counter++;
                rst.add(i);
            }
            temp=0;
        }

        System.out.println("总共有"+counter+"个质数：");
//        for (int i = 0; i<rst.size();i++){
//            System.out.print(rst.get(i));
//            if (i == 0){
//                System.out.print(",");
//            }
//            if (i%10 != 0 && i!= rst.size()-1){
//                System.out.print(",");
//            }
//            if (i%10==0 && i != 0){
//                System.out.println();
//            }
//        }
        return counter;
    }
    public static int countPrimes2(int n) {
        int counter = 2;
        if (n <= 2)
            return 0;
        if (n == 3) {
            return 1;
        }
        int temp = 0;
        for (int i = 4; i< n; i++){
            for (int j = 2; j <= Math.sqrt(i)+1;j++){
                if (i%j == 0){
                    temp = 1;
                    break;
                }
            }
            if (temp == 0){
                counter++;
            }
            temp=0;
        }
        System.out.println("总共有"+counter+"个质数：");
        return counter;
    }

    public static int countPrimes3(int n){
        if (n <3)
        {
            return 0;
        }
        int counter = 0;
        boolean[] primes = new boolean[n-1];
        for (int i = 2, end = (int) (Math.sqrt(n)+1); i<end; i++){
            if(primes[i-1]){
                continue;
            }
            for (int j = 2*i;j<n;j =j+i){
                primes[j-1] = true;
            }
        }
        for (int i = 1;i<n-1;i++){
//            System.out.print(primes[i]+",");
            if (primes[i] == false)
            {
                counter++;
            }
        }
        System.out.println("总共有"+counter+"个质数：");
        return counter;
    }
    public static void main(String args[]){
//        countPrimes2(33315);
//        System.out.println(Integer.MAX_VALUE);
        long startTime = System.currentTimeMillis();
        countPrimes3(1222220);
        long endTime = System.currentTimeMillis();
        System.out.println("Time cost:"+(endTime-startTime));
    }
}
