package How2j;
import java.util.Arrays;
import java.util.Random;
public class GoldCutPoint {
    public static void main(String[] args){
        max();
        combine();
//        waterFlower();
//        float goldPoint = 0.618f;
//        float rst = 1.0f;
//        float temp = 0.0f;
//        int rst_i=0 ,rst_j=0;
//        for (int i = 1; i <= 20; i++)
//            for (int j = i+1; j <= 20; j++){
//                temp = (float)i/(float)j;
//                if (Math.abs(goldPoint-temp)<rst)
//                {
//                    System.out.println(Math.abs(goldPoint-temp)+"_"+rst);
//                    rst = Math.abs(goldPoint-temp);
//                    rst_i = i;
//                    rst_j = j;
//                }
//            }
//        System.out.println("最近的两个数是："+rst_i+"/"+rst_j+"="+(float)rst_i/(float)rst_j);
    }

    public static void waterFlower(){
        int h = 0;
        int t = 0;
        int g = 0;
        for (int i = 100; i < 1000; i++)
        {
            h = i/100;
            t = (i-(h*100))/10;
            g = i-h*100-t*10;
            if (h*h*h + t*t*t + g*g*g == i){
                System.out.print(i+",");
            }

        }
        System.out.println();
    }

    public static void max(){
        int[] arr = {3,5,6,1,99,3,4,5};
        int rst = 0;
        for(int num : arr){
            if (rst < num){
                rst = num;

            }
        }
        System.out.println(rst);
    }

    public static void combine(){
        int[] arr1 = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = ran.nextInt(100);
        }


        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++)
            arr2[i] = ran.nextInt(100);

        int[] rst = new int[15];
        System.arraycopy(arr1,0,rst,0,arr1.length);
        System.arraycopy(arr2,0,rst,arr1.length,arr2.length);
//        for (int num:rst){
//            System.out.print(num+",");
//        }
//        Arrays.sort(rst);
//        Arrays.spliterator();
//        Arrays.it
//       System.out.println(Arrays.toString();
//        return rst;
    }
}
