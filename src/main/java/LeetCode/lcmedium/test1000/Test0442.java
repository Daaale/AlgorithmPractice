package LeetCode.lcmedium.test1000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test0442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = findDuplicates(nums);
        System.out.println(res.size());
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                res.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return res;
    }
}
