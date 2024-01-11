package LeetCode.lceasy.test1000;

import java.util.Arrays;

/**
 * @Author Dale
 * @Date 2023/3/14 21:28
 * @Description
 */
public class Test0561 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        int res = arrayPairSum(nums);
        System.out.println(res);
    }
    public static int arrayPairSum(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            res += nums[i];
        }
        return res;
    }
}
