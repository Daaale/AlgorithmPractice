package LeetCode.lcmedium;

import java.util.HashSet;

/**
 * @author Dale
 * @create 2023-04-21 23:47
 * @description
 */
public class Test2442 {
    public static void main(String[] args) {
        int[] nums = {1,13,10,12,31};
        int res = countDistinctIntegers(nums);
        System.out.println(res);
    }
    public static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            String reverse = reverse(nums[i]);
            set.add(Integer.valueOf(reverse));
        }

        return set.size();
    }

    private static String reverse(int num) {
        String s = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0 ; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
