package Company.LeetCode.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Dale
 * @create 2023-03-29 16:44
 * @description
 */
public class Test0083 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res = permute(nums);
        System.out.println(res);
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }

    public static void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            if (temp.contains(nums[i])) {
                continue;
            }
            // 添加
            temp.add(nums[i]);
            // 递归
            backtrack(nums, temp, res);
            // 回溯
            temp.remove(temp.size() - 1);
        }
    }
}
