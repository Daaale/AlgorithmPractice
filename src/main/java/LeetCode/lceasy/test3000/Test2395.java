package LeetCode.lceasy.test3000;

import java.util.HashSet;

/**
 * @author Dale
 * @create 2023-03-26 10:15
 * @description
 */
public class Test2395 {
    public static void main(String[] args) {
        int[] nums = {4,2,4};
        boolean res = findSubarrays(nums);
        System.out.println(res);
    }
    public static boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            if (set.contains(sum)) {
                return true;
            } else {
                set.add(sum);
            }
        }
        return false;
    }
}
