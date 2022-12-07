package LeetCode.daily;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-12-07 18:40
 * @description
 */
public class Test1775 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6};
        int[] nums2 = {1,1,2,2,2,2};
        int res = minOperations(nums1, nums2);
        System.out.println(res);
    }
    public static int minOperations(int[] nums1, int[] nums2) {
        if (6 * nums1.length < nums2.length || 6 * nums2.length < nums1.length){
            return -1; // 优化
        }
        // 排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 获取总和
        int sum1 = Arrays.stream(nums1).sum();
        int sum2 = Arrays.stream(nums2).sum();
        // num1为和较小的数组
        int d = sum2 - sum1;
        if (d < 0) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            d = -d;
        }
        // 遍历
        int[] cnt = new int[6];
        for (int x : nums1) cnt[6 - x] ++;//num1数组应该加到 6，6 - x 为应该添加的值
        for (int x : nums2) cnt[x - 1] ++;//num2数组应该减到 1，x - 1 为num2应该减少的值，即num1应该添加的值
        // 从大到小遍历添加的值，ans 为已经使用的次数
        for (int i = 5, ans = 0;; i--) {
            if (i * cnt[i] >= d) {
                // 只用了某个变化值的部分次数
                return ans + (d + i - 1) / i;
            }
            // 将某个变化值的全部次数用完
            ans += cnt[i];
            d -= i * cnt[i];
        }

    }
}
