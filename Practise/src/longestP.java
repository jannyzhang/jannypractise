import java.util.Collections;
import java.util.Stack;

public class longestP {
    public static void main(String[] args){
        longestP tt = new longestP();
        tt.longestPalindrome("babad");
    }
    public String longestPalindrome(String s) {
        if (s.length() == 0)
            return s;
        if (s.length() == 1)
            return s;
        if (s.length() == 2)
        {
            if (s.indexOf(0) == s.indexOf(1))
                return s;
            else return s.substring(1);
        }
        char[] c = s.toCharArray();
        int size = 1;
        int begin_index = 0;
        int end_index = 0;
        int maxlength = 0;
        for(int i = 0; i < c.length-1; i++){
            size = 1;
                for (int k = i+1;k<c.length;k++){
                    if (c[k] == c[i]){
                        size++;
                    }
                    else{
                        break;
                    }
                }
                int temp = size;
                begin_index = i;
                end_index = i+size;
                if (end_index == c.length)
                    break;
                for(int j = 1; i-j>=0&&i+j+size-1<c.length;j++){
                    if(c[i-j] == c[i+j+size-1]) {
                        size += 2;
                        begin_index = i-j;
                        end_index = i+j+temp;
                    }
                    else{
                        if(maxlength < size){
                            maxlength = size;
                            begin_index = i-j+1;
                            end_index = i+j+temp-1;
                            break;
                        }
                        else
                            break;
                    }
                }
                i = i+temp-1;
            }
//        Collections.

       System.out.println(s.substring(begin_index,end_index));
        return s.substring(begin_index,end_index);
    }
}
