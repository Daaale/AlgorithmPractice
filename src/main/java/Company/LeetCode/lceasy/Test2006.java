package Company.LeetCode.lceasy;

/**
 * @Author Dale
 * @Date 2022/12/3 19:28
 * @Description
 */
public class Test2006 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        int res = countKDifference(nums, k);
        System.out.println(res);
    }
    public static int countKDifference(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    res ++;
                }
            }
        }
        return res;
    }
}
