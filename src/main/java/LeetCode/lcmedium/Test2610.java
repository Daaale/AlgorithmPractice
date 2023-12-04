package LeetCode.lcmedium;

import java.util.*;

/**
 * @Author Dale
 * @Date 2023/12/4 21:09
 * @Description
 */
public class Test2610 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        List<List<Integer>> matrix = findMatrix(nums);
        System.out.println(Arrays.toString(matrix.get(1).toArray()));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        List<Set<Integer>> set = new ArrayList<>();
        set.add(new HashSet<>());
        for (int i = 0; i < nums.length; i++) {
            // 是否处理成功标志
            boolean flag = true;

            for (int j = 0; j < set.size(); j++) {
                Set<Integer> temp = set.get(j);
                if (temp.contains(nums[i])) {
                    continue;
                } else {
                    temp.add(nums[i]);
                    res.get(j).add(nums[i]);
                    flag = false;
                    break;
                }
            }

            //如果没有处理成功
            if (flag) {
                res.add(new ArrayList<>());
                set.add(new HashSet<>());
                res.get(res.size() - 1).add(nums[i]);
                set.get(res.size() - 1).add(nums[i]);
            }
        }

        return res;
    }
}
