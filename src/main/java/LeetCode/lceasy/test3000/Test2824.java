package LeetCode.lceasy.test3000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test2824 {
    public static void main(String[] args) {
        int[] nums = {-1,1,2,3,1};
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        int target = 2;
        int res = countPairs(list, target);
        System.out.println(res);
    }
    public static int countPairs(List<Integer> nums, int target) {
        int res = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) res ++;
            }
        }
        return res;
    }
}
