package Company.LeetCode.lceasy;

import java.util.Stack;

/**
 * @author Dale
 * @create 2022-12-04 16:51
 * @description
 */
public class Test1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int res = balancedStringSplit(s);
        System.out.println(res);
    }
    public static int balancedStringSplit(String s) {
        int res = 0;
        int num_L = 0;
        int num_R = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                num_L ++;
            } else {
                num_R ++;
            }
            if (num_R == num_L) {
                res ++;
            }
        }
        return res;
    }
}
