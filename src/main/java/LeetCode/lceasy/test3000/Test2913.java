package LeetCode.lceasy.test3000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Test2913 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int res = sumCounts(list);
        System.out.println(res);
    }
    public static int sumCounts(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i; j < nums.size(); j++) {
                int temp = 0;
                HashSet<Integer> set = new HashSet<>();
                for (int k = i; k <= j; k++) {
                    if (!set.contains(nums.get(k))) {
                        temp ++;
                        set.add(nums.get(k));
                    }
                }
                sum += (temp * temp);
            }
        }
        return sum;
    }
}
