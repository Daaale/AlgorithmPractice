package programmer.Dynamic;



/**
 * @author Dale
 * @create 2022-11-14 10:17
 * @description
 */
public class Test0070 {
    public static void main(String[] args) {
        int n = 3;
        int res = climbStairs(n);
        System.out.println(res);
    }

    private static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
