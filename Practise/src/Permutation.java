import java.util.*;

public class Permutation {
    public static void permutation(char[]ss,int i){
        if(ss==null||i<0 ||i>ss.length){//1
            return;
        }

        if(i==ss.length-1){//2
            System.out.print(new String(ss)+" ");
        }else{
            for(int j=i;j<ss.length;j++){//3
                char temp=ss[j];//交换前缀,使之产生下一个前缀
                ss[j]=ss[i];
                ss[i]=temp;
                permutation(ss,i+1);//4
                temp=ss[j]; //将前缀换回来,继续做上一个的前缀排列.//5
                ss[j]=ss[i];
                ss[i]=temp;
            }
        }
    }

    public static void permutation1(String str ,String result ,int len){

        if(result.length()==len){            //表示遍历完了一个全排列结果
            System.out.println(result);
        }
        else{
            for(int i=0;i<str.length();i++){
                if(result.indexOf(str.charAt(i))<0){    //返回指定字符在此字符串中第一次出现处的索引。
                    permutation1(str, result+str.charAt(i), len);
                }
            }
        }
    }

    List<List<Integer>> rst = new LinkedList<>() ;

    public  List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0)
            return rst;
        int length = nums.length;
        List<Integer> nrst = new LinkedList<>();
        get_permute(length,nums,nrst);
        System.out.println(rst.get(0).size());
            for (int i = 0;i<rst.size();i++) {
                for (int j = 0; j < rst.get(i).size(); j++)
                    System.out.print(rst.get(i).get(j) + ",");
                System.out.println();
            }
//        System.out.print(String(rst));
        return rst;
    }

    public void get_permute(int length,int[] nums,List<Integer> list) {
        if (list.size() == length) {
            List<Integer> nrst = new LinkedList<>(list);
            rst.add(nrst);
        }
        else {
            for (int i = 0; i< nums.length;i++){
                if (!list.contains(nums[i])){
                    list.add(nums[i]);
                    get_permute(length,nums,list);
                    list.remove(list.size()-1);

                }
            }

        }
    }

    public void remove(List<Integer> list){
        for (int i = 0; i < list.size(); i++)
            list.remove(i);
    }
    public static void main(String args[]) {

//        permutation(new char[]{'a', 'b', 'c', 'd','e'}, 0);
//
//        permutation1("abca","",5);
        int[] nums = {1,2,3};
        Permutation air = new Permutation();
        air.permute(nums);
    }
}
