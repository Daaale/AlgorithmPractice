package LeetCode.lceasy.test3000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2974 {
    public static void main(String[] args) {
        int[] nums = {5,4,2,3};
        int[] res = numberGame(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] numberGame(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        while (len > 0) {
            // 找到最小的两个数
            int a = Integer.MAX_VALUE;
            int position_a = 0;
            int b = Integer.MAX_VALUE;
            int position_b = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < a && nums[i] != 0) {
                    a = nums[i];
                    position_a = i;
                }
            }
            nums[position_a] = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < b && nums[i] != 0) {
                    b = nums[i];
                    position_b = i;
                }
            }
            nums[position_b] = 0;
            list.add(b);
            list.add(a);
            len -= 2;
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
