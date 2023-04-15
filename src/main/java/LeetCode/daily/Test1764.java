package LeetCode.daily;

/**
 * @author Dale
 * @create 2022-12-17 15:20
 * @description
 */
public class Test1764 {
    public static void main(String[] args) {
//        int[][] groups = {{1,-1,-1},{3,-2,0}};
//        int[] nums = {1,-1,0,1,-1,-1,3,-2,0};
        int[][] groups = {{10,-2},{1,2,3,4}};
        int[] nums = {1,2,3,4,10,-2};
        boolean res = canChoose(groups, nums);
        System.out.println(res);
    }
    public static boolean canChoose(int[][] groups, int[] nums) {
        int start = 0;
        int res = groups.length;
        for (int i = 0; i < groups.length; i++) {
            int[] temp = groups[i];
            for (int j = start; j < nums.length; j++) {
                // 找到 nums 数组中的连续子序列
                // 先找到第一个
                if (nums[j] == temp[0]) {
                    boolean flag = true;
                    for (int k = 0; k < temp.length; k++) {
                        if (j + k >= nums.length || temp[k] != nums[j + k]) {
                            flag = false;
                            break;
                        }
                    }
                    // 满足要求的子数组
                    if (flag) {
                        res --;
                        j = j + temp.length;
                        start = j;
                        break;
                    }
                }
            }
        }
        return res == 0;
    }
}
