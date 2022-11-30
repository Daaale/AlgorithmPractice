package LeetCode.easy;


import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-29 22:34
 * @description
 */
public class Test1929 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] res = getConcatenation(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }
        return res;
    }
}
