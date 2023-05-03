package LeetCode.daily;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-28 16:26
 * @description
 */
public class Test0813 {
    public static void main(String[] args) {
        int[] nums = {4,1,7,5,6,2,3};
        int k = 4;
        double res = largestSumOfAverages(nums, k);
        System.out.println(res);
    }
    public static double largestSumOfAverages(int[] nums, int m) {
        // 初始化
        int n = nums.length;
        double[] sum = new double[n + 1];
        // sum数组是从下标 1 开始，就是前面所有数的和
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        // 动态规划
        // dp[i][j] 将前i个元素划分成j份的最大平均和
        double[][] dp = new double[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, m); j++) {
                // 将前 i 个元素分成 j 份，j的范围是 i 和 m 的最小值
                if (j == 1) {
                    // 将前i个元素分成1份，因此需要sum[i] / i
                    dp[i][1] = sum[i] / i;
                } else {
                    for (int k = 2; k <= i; k++) {
                        // 这里遍历为重新划分前i个元素
                        // dp[k - 1][j - 1] + (sum[i] - sum[k - 1]) / (i - k + 1)
                        // 此处动态规划为 先看分成 j-1 份的最大值，再加上最后一份
                        dp[i][j] = Math.max(dp[i][j], dp[k - 1][j - 1] + (sum[i] - sum[k - 1]) / (i - k + 1));
                    }
                }
            }
        }
        return dp[n][m];
    }
}
