public class ToRoman {
    public static void main(String[] args) {
        ToRoman tt = new ToRoman();
        String rst = tt.intToRoman(3);
        System.out.println(rst);
    }
    public String intToRoman(int num) {
//        char[] roman = {'I','V','X','L','C','D','M'};
        int t = num /1000;
        int h = num%1000/100;
        int d = num%1000%100/10;
        int s = num%1000%100%10;
        String rst ="";
        for (int i = 0;i<t;i++)
            rst+='M';
        if (h>=5) {
            if (h == 9) {
                rst += 'C';
                rst += 'M';
            }
            else{
                rst += 'D';
                for (int i = 0;i<h-5;i++){
                    rst+='C';
                }
            }
        }
        else {
            if (h == 4){
                rst += 'C';
                rst += 'M';
            }
            else {
                for (int i = 0;i<h;i++){
                    rst+='C';
                }
            }
        }

        if (d >= 5){
            if (d ==9){
                rst += 'X';
                rst += 'C';
            }
            else {
                rst += 'L';
                for (int i = 0;i<d-5;i++){
                    rst+='X';
                }
            }
        }
        else {
            if (d == 4){
                rst += 'X';
                rst += 'L';
            }
            else {
                for (int i = 0;i<d;i++){
                    rst+='X';
                }
            }
        }

        if (s >= 5){
            if (s ==9){
                rst += 'I';
                rst += 'X';
            }
            else {
                rst += 'V';
                for (int i = 0;i<s-5;i++){
                    rst+='I';
                }
            }
        }
        else {
            if (s == 4){
                rst += 'I';
                rst += 'V';
            }
            else {
                for (int i = 0;i<s;i++){
                    rst+='I';
                }
            }
        }
        return rst;
    }


}
