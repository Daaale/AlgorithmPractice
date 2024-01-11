package LeetCode.lceasy.test1000;

public class Test0908 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 6};
        int k = 3;
        int res = smallestRangeI(nums, k);
        System.out.println(res);
    }
    public static int smallestRangeI(int[] nums, int k) {
        // 首先找到最小值和最大值
        int max = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
        }
        // 最小值与最大值相同，直接返回 0
        if (max == min) return 0;
        // 最小值与最大值不相同
        if (max - min > 2 * k) {
            return max - min - 2 * k;
        } else {
            return 0;
        }
    }
}
