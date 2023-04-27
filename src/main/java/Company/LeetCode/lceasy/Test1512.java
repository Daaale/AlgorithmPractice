package Company.LeetCode.lceasy;

/**
 * @Author Dale
 * @Date 2022/12/3 19:22
 * @Description
 */
public class Test1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }
    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) res++;
            }
        }
        return res;
    }
}
