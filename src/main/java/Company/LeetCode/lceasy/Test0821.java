package Company.LeetCode.lceasy;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-14 14:42
 * @description
 */
public class Test0821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] res = shortestToChar(s, c);
        System.out.println(Arrays.toString(res));
    }
    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                res[i] = 0;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) != c && res[j] > j - i) {
                        res[j] = j - i;
                    } else {
                        i = j - 1;
                        break;
                    }
                }
            }
        }
        for (int i = s.length() - 1; i >= 0 ; i--) {
            if (s.charAt(i) == c) {
                for (int j = i - 1; j >= 0 ; j--) {
                    if (s.charAt(j) != c && res[j] > i - j) {
                        res[j] = i - j;
                    } else {
                        i = j + 1;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
