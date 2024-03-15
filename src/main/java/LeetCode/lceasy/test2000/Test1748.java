package LeetCode.lceasy.test2000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Test1748 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int res = sumOfUnique(nums);
        System.out.println(res);
    }
    public static int sumOfUnique(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (map.get(next).equals(1))
                res += next;
        }
        return res;
    }
}
