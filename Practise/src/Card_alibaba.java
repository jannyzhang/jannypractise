import java.util.HashMap;
import java.util.List;

public class Card_alibaba {

    public static void howMuch(float[] price,int[] p_xi,int[] p_yi, int[] N,int[] N_count){


        int temp = 0;
        for (int i = 0; i < N.length; i++){
            for (int j = 0; j < p_xi.length; j++){
                if (i>= p_xi[j] && i<=p_yi[j]){
                    temp = 1;
                    break;
                }
            }

            if (temp == 0){
                System.out.println("不可能集齐。");
                return;
            }
            temp = 0;
        }


    }
}
