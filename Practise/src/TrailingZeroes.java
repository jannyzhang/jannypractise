public class TrailingZeroes {
    public static  int trailingZeroes(int n) {
        int temp = 0;
        int rst = 0;
        int n_temp = n;
        int mul = 1;
        while ((n_temp=n_temp/5)>=1){
            temp++;
        }

        for (int i = 1;i<=temp;i++){
            mul = mul * 5;
            rst = rst + n /  mul;
        }

        return rst;

    }

    public static void main(String args[]){
        System.out.println(trailingZeroes(625));
    }
}
