package LeetCode.lceasy.test1000;

import java.util.Arrays;
import java.util.List;

public class Test0905 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] res = sortArrayByParity(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[left] = nums[i];
                left ++;
            } else {
                res[right] = nums[i];
                right --;
            }
        }
        return res;
    }
}
