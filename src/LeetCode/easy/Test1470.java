package LeetCode.easy;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-29 22:26
 * @description
 */
public class Test1470 {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(nums, n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int cnt = 0;
        for (int i = 0; i < nums.length; i += 2, cnt++) {
            res[i] = nums[cnt];
            res[i + 1] = nums[cnt + n];
        }
        return res;
    }

}
