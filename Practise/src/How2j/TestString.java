package How2j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestString {
    public static void main(String[] args) {
        String str1 = "the light";
        String str3 = "the light";
        System.out.println( str1  ==  str3);
        sameChar();
        timeCost();

    }

    public static void sameChar(){
        String str = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
        Random ra = new Random();
        String[] strs = new String[100];
        int str_length = str.length();
        for (int i = 0; i < strs.length; i++){
           int index = ra.nextInt(str_length);
           strs[i] = String.valueOf(str.charAt(index));
           index = ra.nextInt(str_length);
           strs[i] += str.charAt(index);
        }
//        int[] ii = new int[100];
        System.out.println(Arrays.toString(strs));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strs.length-1; i++){
            for (int j = i+1; j < strs.length; j++){
                if (strs[i].equals(strs[j]))
                    if (!list.contains(strs[i]))
                        list.add(strs[i]);
            }
        }
        String rst = list.toString();
        System.out.println(rst);
    }

    public static void timeCost(){
        String str = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
        String str_str = new String();
        StringBuilder str_builder = new StringBuilder();
        double time_begin = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++ ){
//            str_str += String.valueOf((char)Math.round( Math.random()*25 + 65));
            str_str += i;
        }
        double time_end = System.currentTimeMillis();
//        System.out.println(str_str);
        System.out.println("Time cost: "+(time_end-time_begin));
        time_begin = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++ ){
//            str_builder.append(String.valueOf((char)Math.round( Math.random()*25 + 65)));
            str_builder.append(i);
        }
//        System.out.println(str_builder);
         time_end = System.currentTimeMillis();
        System.out.println("Time cost: "+(time_end-time_begin));

        StringBuffer sb = new StringBuffer();

    }
}
