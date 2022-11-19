package programmer.Dynamic;

/**
 * @author Dale
 * @create 2022-11-16 14:40
 * @description
 */
public class Test0062 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int res = uniquePaths(m, n);
        System.out.println(res);
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        //动态规划
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
