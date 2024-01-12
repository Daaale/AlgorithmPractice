package LeetCode.lceasy.test2000;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1313 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = decompressRLElist(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                list.add(val);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
