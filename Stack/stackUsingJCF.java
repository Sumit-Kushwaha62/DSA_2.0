//package 10_Stack;
// Implimenting stack using JCF

import java.util.*;

public class stackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(4);
        s.push(8);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
