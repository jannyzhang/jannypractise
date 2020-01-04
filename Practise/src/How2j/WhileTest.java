package How2j;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.print("请输入一个正整数:");
        int num = ss.nextInt();
        int i = 1;
        int rst = 1;
        outloop:
        while ( i <= num){
            rst = rst * i;
            i++;
            if (i%5==0)
                break outloop;
        }
        System.out.println(rst);
    }
}
