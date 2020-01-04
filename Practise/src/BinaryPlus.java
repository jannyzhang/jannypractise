public class BinaryPlus {
    private int lu;



    public int getLu() {
        return lu;
    }

    public void setLu(int lu) {
        this.lu = lu;
    }

    public String addBinary(String a, String b){
        String aa = a;
        String bb = b;
        if (b.length() >a.length()){
            for (int i = 0;i<b.length() - a.length(); i++){
                aa = "0"+aa;
            }
        }
        if (a.length() > b.length()){
            for (int i = 0; i < a.length() - b.length(); i++){
                bb = "0"+bb;
            }
        }
        String rst = "";
        char[] a_Binary = aa.toCharArray();
        char[] b_Binary = bb.toCharArray();
        int add = 0;
        int temp = 0;
        for (int i = a_Binary.length - 1; i >= 0; i--){
            temp = (int)a_Binary[i] - (int)('0') + (int)b_Binary[i] - (int)('0')+add;
            if ( temp >=   2){
                add=1;
                rst = String.valueOf(temp%2)+rst;
            }
            else {
                add = 0;
                rst = String.valueOf(temp)+rst;
            }
        }
        if (add == 1){
            rst = "1"+rst;
        }
        System.out.println(rst);

        return rst;
    }

    public String addBinary2(String a,String b){
        int alength = a.length();
        int blength = b.length();
        int longer = alength > blength ? alength: blength;
        int[] vva = new int[longer];
        for (int i = 1;i <=  alength;i++){
            vva[longer - i] =  a.charAt(alength - i) - '0';
        }
        int[] vvb = new int[longer];
        for (int i = 1;i <=  blength;i++){
            vvb[longer - i] =  b.charAt(blength - i) - '0';
        }
        int add = 0;
        for(int i = 1;i <= longer;i++){
            int sum = vva[longer - i] + vvb[longer - i] + add;
            if(sum >= 2){
                vva[longer - i] = sum % 2;
                add = 1;
            }
            else {
                vva[longer - i] = sum;
                add = 0;
            }
        }
        System.out.println();

        StringBuilder sb = new StringBuilder("");

        if (add == 1) {
            vva[0] = vva[0] % 2;
            sb.append(1);
        }
        for(int i = 0;i < longer;i++)
            sb.append(vva[i]);
        System.out.println(sb.toString());
        return sb.toString();

    }

    public static void main(String args[]){
        BinaryPlus test1 = new BinaryPlus();
        test1.addBinary2("1110001","1111");
    }
}
