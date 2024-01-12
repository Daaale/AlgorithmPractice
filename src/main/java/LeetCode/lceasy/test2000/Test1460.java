package LeetCode.lceasy.test2000;

import java.util.HashMap;
import java.util.HashSet;

public class Test1460 {
    public static void main(String[] args) {
        int[] target = {1,2,3,4};
        int[] arr = {2,4,1,3};
        boolean res = canBeEqual(target, arr);
        System.out.println(res);
    }
    public static boolean canBeEqual(int[] target, int[] arr) {
        // 检查元素个数与种类是否满足
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            if (map.containsKey(target[i])) {
                map.put(target[i], map.get(target[i]) + 1);
            } else {
                map.put(target[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (map.get(arr[i]) > 0) {
                    map.put(arr[i], map.get(arr[i]) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
