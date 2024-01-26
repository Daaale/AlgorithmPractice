package LeetCode.lceasy.test1000;

import java.util.HashMap;

public class Test0961 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        int res = repeatedNTimes(nums);
        System.out.println(res);
    }
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

            if (map.get(nums[i]) == nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }
}
