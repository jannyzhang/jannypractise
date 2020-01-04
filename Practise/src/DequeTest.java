import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DequeTest {
    public static void main(String[] args) {
        Deque<Integer> de = new ArrayDeque<>();
        de.push(1);
        de.push(2);
        de.push(3);

//        System.out.println(Collections.list(de));
        System.out.println(de.pollLast());
        System.out.println(de.pollLast());
        System.out.println(de.peek());

        Stack<Integer> stack  = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        String tt = "acasdahd";
        String rtt = "";
        rtt = tt.replace('a','z');
        System.out.println(rtt);

        Pattern p = Pattern.compile("a");
        rtt=tt.replaceAll("a","b");
        System.out.println(rtt);

        rtt=tt.replaceAll("\\w","2");
        System.out.println(rtt);

        Matcher n  = p.matcher(tt);
        int i = 0;
        while (n.find()){
            System.out.println(++i);
        }
        String fs = String.valueOf(2.2);
        Integer.valueOf("2");
        float f = Float.parseFloat("2.33");

        Math.round(f);
    }
}
