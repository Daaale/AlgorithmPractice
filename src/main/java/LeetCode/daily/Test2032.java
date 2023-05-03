package LeetCode.daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author Dale
 * @create 2022-12-29 18:32
 * @description
 */
public class Test2032 {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2};
        int[] nums2 = {2,3};
        int[] nums3 = {3};
        List<Integer> res = twoOutOfThree(nums1, nums2, nums3);
        System.out.println(res);
    }
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        for (int i = 0; i < nums3.length; i++) {
            set3.add(nums3[i]);
        }
        //1 2 或 1 3 中有的
        for (int i = 0; i < nums1.length; i++) {
            int temp = nums1[i];
            //首先判断set中是否有
            if (set.contains(temp)) continue;
            //判断set2和set3中是否有
            if (set2.contains(temp) || set3.contains(temp)) {
                set.add(temp);
            }
        }
        // 2 3 中有的
        for (int i = 0; i < nums2.length; i++) {
            int temp = nums2[i];
            if (set.contains(temp)) continue;
            if (set3.contains(temp)) {
                set.add(temp);
            }
        }
        //set转化为list
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(set);
        return res;
    }
}
