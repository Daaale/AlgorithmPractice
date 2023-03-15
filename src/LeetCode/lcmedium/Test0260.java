package LeetCode.lcmedium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Dale
 * @create 2023-03-15 18:53
 * @description
 */
public class Test0260 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        int[] res = singleNumber(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        int[] res = new int[2];
        int i = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            res[i] = iterator.next();
            i++;
        }
        return res;
    }
}
