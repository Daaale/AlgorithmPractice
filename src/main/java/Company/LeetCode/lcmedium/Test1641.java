package Company.LeetCode.lcmedium;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-29 15:51
 * @description
 */
public class Test1641 {
    public static void main(String[] args) {
        int n = 2;
        int res = countVowelStrings(n);
        System.out.println(res);
    }
    public static int countVowelStrings(int n) {
        int[] dp = new int[5];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {
                dp[j] += dp[j - 1];
            }
        }
        return Arrays.stream(dp).sum();
    }
}
