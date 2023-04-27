package Company.LeetCode.lcmedium;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-04-08 19:37
 * @description
 */
public class Test2161 {
    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
        int[] res = pivotArray(nums, pivot);
        System.out.println(Arrays.toString(res));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                list1.add(nums[i]);
            } else if (nums[i] == pivot) {
                list2.add(pivot);
            } else {
                list3.add(nums[i]);
            }
        }
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(list1);
        list4.addAll(list2);
        list4.addAll(list3);
        for (int i = 0; i < nums.length; i++) {
            res[i] = list4.get(i);
        }
        return res;
    }
}
