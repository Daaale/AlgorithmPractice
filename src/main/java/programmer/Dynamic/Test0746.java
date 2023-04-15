package programmer.Dynamic;

/**
 * @author Dale
 * @create 2022-11-16 13:52
 * @description
 */
public class Test0746 {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int res = minCostClimbingStairs(cost);
        System.out.println(res);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Integer.min(dp[i-2] + cost[i-2], dp[i-1] + cost[i-1]);
        }
        return dp[cost.length];
    }
}
