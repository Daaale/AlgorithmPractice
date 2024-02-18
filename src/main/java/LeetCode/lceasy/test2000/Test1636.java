package LeetCode.lceasy.test2000;

import java.util.*;


public class Test1636 {
    public static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        int[] res = frequencySort(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        ArrayList<Integer> temp = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                temp.add(entry.getKey());
            }
        }
        int[] res = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            res[i] = temp.get(i);
        }
        return res;
    }
}
