package Company.LeetCode.lceasy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-19 18:09
 * @description
 */
public class Test2553 {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        int[] res = separateDigits(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // 将 num 分隔后放入 list
            String str = String.valueOf(num);
            for (int j = 0; j < str.length(); j++) {
                list.add(Integer.valueOf(str.charAt(j) - 48));
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
