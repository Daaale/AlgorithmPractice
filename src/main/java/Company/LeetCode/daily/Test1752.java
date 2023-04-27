package Company.LeetCode.daily;

import java.util.Arrays;


/**
 * @author Dale
 * @create 2022-11-27 11:51
 * @description
 */
public class Test1752 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        boolean res = check(nums);
        System.out.println(res);
    }
    public static boolean check(int[] nums) {
        // 1.找到有序源数组
        int[] old = Arrays.copyOf(nums, nums.length);
        Arrays.sort(old);
        // 2.判断
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == old[0] && judgeX(i, nums, old)) {
                return true;
            }
        }
        return false;
    }

    private static boolean judgeX(int x, int[] nums, int[] old) {

        for (int i = 0; i < nums.length; i++) {
            if (old[i] != nums[(i + x) % old.length]) {
                return false;
            }
        }
        return true;
    }
}
