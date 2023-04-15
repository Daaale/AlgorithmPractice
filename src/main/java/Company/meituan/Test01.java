package Company.meituan;

import java.util.Scanner;

/**
 * @author Dale
 * @create 2023-03-11 19:06
 * @description
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = getMinUpdateOps(str);
        System.out.println(res);
    }

    private static int getMinUpdateOps(String str) {
        int[] dp = new int[str.length() + 1];
        dp[0] = 0;//第一位不改
        int[] cnt = new int[str.length()];
        for (int i = 1; i < str.length(); i++) {
            char left = str.charAt(i - 1);
            char right = str.charAt(i);
            if (left == right && cnt[i - 1] == 0) {
                // 前一位没改，后一位要改
                cnt[i] = 1;
                dp[i] = dp[i - 1] + 1;
            } else {
                // 前一位改过了，后一位不用改
                // 不一样，不用改
                dp[i] = dp[i - 1];
            }
        }
        return dp[str.length() - 1];
    }
}
