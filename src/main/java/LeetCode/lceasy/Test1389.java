package LeetCode.lceasy;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Dale
 * @create 2023-03-19 17:30
 * @description
 */
public class Test1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        int[] res = createTargetArray(nums, index);
        System.out.println(Arrays.toString(res));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }

        return target;
    }
}
