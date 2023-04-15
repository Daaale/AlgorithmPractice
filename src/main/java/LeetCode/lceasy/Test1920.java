package LeetCode.lceasy;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-29 16:28
 * @description
 */
public class Test1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] res = buildArray(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = nums[nums[i]];
        }
        return res;
    }
}
