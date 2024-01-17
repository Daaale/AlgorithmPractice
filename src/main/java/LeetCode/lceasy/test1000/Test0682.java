package LeetCode.lceasy.test1000;

import java.util.Stack;

public class Test0682 {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        int res = calPoints(ops);
        System.out.println(res);
    }
    public static int calPoints(String[] operations) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if ("D".equals(operations[i])) {
                int temp = stack.peek() * 2;
                stack.push(temp);
                res += (temp);
            } else if ("C".equals(operations[i])) {
                Integer c = stack.pop();
                res -= c;
            } else if ("+".equals(operations[i])) {
                Integer b = stack.pop();
                int a = stack.peek();
                stack.push(b);
                stack.push(a + b);
                res += (a + b);
            } else {
                int value = Integer.parseInt(operations[i]);
                stack.push(value);
                res += value;
            }
        }
        return res;
    }
}
