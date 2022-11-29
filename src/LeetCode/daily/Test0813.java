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
    public static double largestSumOfAverages(int[] nums, int k) {
        double res = 0.0;
        int n = k - 1;
        Arrays.sort(nums);
        for (int i = nums.length - 1; n > 0; i--,n--) {
            res += nums[i];
        }
        double temp = 0;
        for (int i = 0; i <= nums.length - k; i++) {
            temp += nums[i];
        }

        return res + temp / (nums.length - k + 1);
    }
}
