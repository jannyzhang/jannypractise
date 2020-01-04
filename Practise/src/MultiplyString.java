public class MultiplyString {
    public String multiply(String num1, String num2) {
        char[] num1_c = num1.toCharArray();
        char[] num2_c = num2.toCharArray();

        int num1_len = num1_c.length;
        int num2_len = num2_c.length;

        int[] num1_int = new int[num1_len];
        int[] num2_int = new int[num2_len];

        for (int i = 0; i < num1_len ; i++)
            num1_int[i] = num1_c[i] - '0';

        for (int i = 0; i < num2_len ; i++)
            num2_int[i] = num2_c[i] - '0';

        int temp;
        int[] rst = new int[num1_len+num2_len];
        for (int i = num1_len-1; i >= 0 ;i--) {
            for (int j = num2_len - 1; j >= 0; j--) {
                temp = num1_int[i] * num2_int[j];
                temp += rst[i + j + 1];
                rst[i + j] += temp / 10;
                rst[i + j + 1] = temp % 10;
            }
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        while (i<rst.length-1&&rst[i]==0)
            i++;
        for (;i<rst.length;i++)
            str.append(rst[i]);
        System.out.println("result:"+str.toString());
        str.hashCode()
        return str.toString();
    }

    public static void main(String args[]){
        MultiplyString tt = new MultiplyString();
        tt.multiply("222","323");
    }
}
