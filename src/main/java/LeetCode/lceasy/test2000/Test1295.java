package LeetCode.lceasy.test2000;

public class Test1295 {
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};
        int res = findNumbers(nums);
        System.out.println(res);
    }
    public static int findNumbers(int[] nums) {
        int evens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0)
                evens ++;
        }
        return evens;
    }
}
