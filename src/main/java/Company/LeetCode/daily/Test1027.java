package Company.LeetCode.daily;

/**
 * @author Dale
 * @create 2023-04-22 13:16
 * @description
 *
 */
public class Test1027 {
    public static void main(String[] args) {
        int[] nums = {20,1,15,3,10,5,8};
        int res = longestArithSeqLength(nums);
        System.out.println(res);
    }
    public static int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][1001];
        int res = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int k = nums[i] - nums[j] + 500;
                dp[i][k] = Math.max(dp[i][k], dp[j][k] + 1);
                res = Math.max(res, dp[i][k]);
            }
        }
        return res + 1;
    }
}
