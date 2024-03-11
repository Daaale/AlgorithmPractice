package LeetCode.lcmedium.test1000;

public class Test0413 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int res = numberOfArithmeticSlices(nums);
        System.out.println(res);
    }
    public static int numberOfArithmeticSlices(int[] nums) {
        int sum = 0;
        if (nums.length < 3) return 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int diff1 = nums[i + 1] - nums[i];
            int diff2 = nums[i + 2] - nums[i + 1];
            if (diff1 != diff2) continue;
            for (int j = i + 2; j < nums.length; j++) {
                if (diff1 == nums[j] - nums[j - 1]) {
                    sum ++;
                } else {
                    break;
                }
            }
        }
        return sum;
    }
}
