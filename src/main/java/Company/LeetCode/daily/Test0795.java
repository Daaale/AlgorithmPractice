package Company.LeetCode.daily;

/**
 * @author Dale
 * @create 2022-11-24 22:29
 * @description
 */
public class Test0795 {
    public static void main(String[] args) {
//        int[] nums = {2,9,2,5,6};
        int[] nums = {2,1,4,3};
        int left = 2;
        int right = 3;
        int res = numSubarrayBoundedMax(nums, left, right);
        System.out.println(res);
    }
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int res = 0;
        int last1 = -1;
        int last2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= left && nums[i] <= right) {
                last1 = i;
            }
            if (nums[i] > right) {
                last2 = i;
                last1 = -1;
            }
            if (last1 != -1) {
                res += (last1 - last2);
            }
        }

        return res;
    }
}
