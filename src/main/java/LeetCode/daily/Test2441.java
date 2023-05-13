package LeetCode.daily;

/**
 * @author Dale
 * @create 2023-05-13 18:32
 * @description
 */
public class Test2441 {
    public static void main(String[] args) {
        int[] nums = {-1,2,-3,3};
        int res = findMaxK(nums);
        System.out.println(res);
    }
    public static int findMaxK(int[] nums) {
        int[] cnt = new int[2002];
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                cnt[nums[i] + 1000] ++;
            } else {
                cnt[-nums[i]] ++;
            }
            int num = Math.abs(nums[i]);
            if (cnt[num] >= 1 && cnt[num + 1000] >= 1) {
                if (max < num) {
                    max = num;
                }
            }
        }
        return max;
    }
}
