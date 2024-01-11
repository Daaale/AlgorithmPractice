package LeetCode.lceasy.test1000;

import java.util.Arrays;

/**
 * @Author Dale
 * @Date 2023/3/14 22:09
 * @Description
 */
public class Test0942 {
    public static void main(String[] args) {
        String s = "IDID";
        int[] res = diStringMatch(s);
        System.out.println(Arrays.toString(res));
    }
    public static int[] diStringMatch(String s) {
        int[] res = new int[s.length() + 1];
        int left = 0;
        int right = s.length();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') {
                res[i] = left;
                left ++;
            } else {
                res[i] = right;
                right --;
            }
        }
        res[s.length()] = left;
        return res;
    }
}
