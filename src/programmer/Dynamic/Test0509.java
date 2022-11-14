package programmer.Dynamic;


/**
 * @Author Dale
 * @Date 2022/10/15 17:07
 * @Description
 */
public class Test0509 {
    public static void main(String[] args) {
        int n = 4;
        int res = getFib(n);

    }

    private static int getFib(int n) {
        if (n <= 1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2 ; i<=n ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];

    }
}
