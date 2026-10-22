//package 10_Stack;

import java.util.Stack;

public class pushAtBottom {

    public static void pushAtBottomm(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottomm(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);

        pushAtBottomm(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
