package How2j;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        System.out.print("请输入一个1-12的数：");
        int season = ss.nextInt();
        switch (season){
            case 1: case 2: case 12:
                System.out.println("冬天");
                break;
            case 3: case 4: case 5:
                System.out.println("春天");
                break;
            case 6: case 7: case 8:
                System.out.println("夏天");
                break;
            case 9: case 10: case 11:
                System.out.println("秋天");
                break;
            default:
                System.out.println("yyyy");
                break;
        }

    }

}
