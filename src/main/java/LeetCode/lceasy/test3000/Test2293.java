package LeetCode.lceasy.test3000;

public class Test2293 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,8,2,2};
        int res = minMaxGame(nums);
        System.out.println(res);
    }
    public static int minMaxGame(int[] nums) {
        if (nums.length == 1) return nums[0];
        while (nums.length > 2) {
            int[] temp = new int[nums.length / 2];
            for (int i = 0; i < temp.length; i+=2) {
                temp[i] = Math.min(nums[i*2], nums[i*2+1]);
                temp[i + 1] = Math.max((nums[i*2+2]), nums[i*2+3]);
            }
            nums = temp;
        }
        return Math.min(nums[0], nums[1]);
    }
}
