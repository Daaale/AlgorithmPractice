package LeetCode.lcmedium.test1000;

import java.util.List;

public class Test0969 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        List<Integer> res = pancakeSort(arr);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    public static List<Integer> pancakeSort(int[] arr) {

    }

    public static int[] reverse(int[] arr, int l) {
        int[] res = new int[arr.length];
        for (int i = 0; i < l; i++) {
            res[l - i - 1] = arr[i];
        }
        if (l < arr.length) {
            for (int i = l; i < arr.length; i++) {
                res[i] = arr[i];
            }
        }
        return res
    }
}
