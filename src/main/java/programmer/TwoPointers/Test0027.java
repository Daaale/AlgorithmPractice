package programmer.TwoPointers;

/**
 * @author Dale
 * @create 2022-11-14 10:20
 * @description
 */
public class Test0027 {
    public static void main(String[] args) {
        int[] nums = {2};
        int val = 3;
        int res = removeElement(nums, 3);
        System.out.println(res);
    }
    public static int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i=0 ; i<nums.length ; i++) {
            if (nums[i] == val) {
                for (int j=i+1 ; j<nums.length ; j++) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        res ++;
                        break;
                    }
                }
            } else {
                res ++;
            }
        }
        return res;
    }
}
