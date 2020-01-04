import java.util.ArrayList;
import java.util.List;

public class GetAllCombines {
    public static List<List<Integer>> getAllCom(int[] nums){
        int counter = 1<<nums.length;
//        List<Integer> list_temp = new ArrayList<>();
        List<List<Integer>> list_rst = new ArrayList<>();
        for (int i = 0;i<counter;i++){
            List<Integer> list_temp = new ArrayList<>();
            String str_temp = Integer.toBinaryString(i);
            while (str_temp.length()<nums.length)
                str_temp= "0"+str_temp;
            System.out.print(str_temp+">>>");
            for (int j = str_temp.length()-1;j>=0;j--){
                if (str_temp.charAt(j) == '1'){
                    list_temp.add(nums[j]);
                }
            }

            list_rst.add(list_temp);
            for (int k = 0;k<list_temp.size();k++)
                System.out.print(list_temp.get(k));
            System.out.println();

//            list_temp.clear();
        }
//        for (int i = 0; i<list_rst.size();i++)
//            for (int j = 0;;j<li)
        return list_rst;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        getAllCom(nums);
    }


}
