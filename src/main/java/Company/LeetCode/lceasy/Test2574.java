package Company.LeetCode.lceasy;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-04-02 17:05
 * @description
 */
public class Test2574 {
    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        int[] res = leftRigthDifference(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] leftRigthDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            right += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            answer[i] = Math.abs(left - right);
            right -= nums[i];
        }
        return answer;
    }
}
