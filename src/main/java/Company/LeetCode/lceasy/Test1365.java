package Company.LeetCode.lceasy;

import java.util.Arrays;

/**
 * @Author Dale
 * @Date 2022/12/3 19:25
 * @Description
 */
public class Test1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] res = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    res[i] ++;
                }
            }
        }
        return res;
    }
}
