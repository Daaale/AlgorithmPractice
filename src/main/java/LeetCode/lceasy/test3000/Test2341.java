package LeetCode.lceasy.test3000;

import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Test2341 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        int[] res = numberOfPairs(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int cnt = 0;
        int num = 0;
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            Integer cnts = map.get(next);
            cnt += cnts / 2;
            num += cnts % 2;
        }
        return new int[]{cnt, num};
    }
}
