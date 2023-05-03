package LeetCode.lceasy;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author Dale
 * @Date 2023/3/14 21:46
 * @Description
 */
public class Test1021 {
    public static void main(String[] args) {
        String s = "(()())(())";
        String res = removeOuterParentheses(s);
        System.out.println(res);
    }
    public static String removeOuterParentheses(String s) {
        // 原语化解
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                int left = i;
                int right = 0;
                stack.push(s.charAt(i));
                for (int j = i + 1; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (c == ')' && '(' == stack.peek()) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                    if (stack.isEmpty()) {
                        right = j;
                        i = j;
                        break;
                    }
                }
                sb.append(s.substring(left + 1, right));
            }

        }
        return sb.toString();
    }
}
