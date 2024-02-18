package LeetCode.lcmedium.test1000;

import java.util.ArrayList;
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
        List<Integer> res = new ArrayList<>();
        int len = arr.length;
        // 反转子数组 arr[0...k-1] ，所以要把最大值先搞到最后
        while (len > 1) {
            int maxValIndex = findMaxValIndex(arr, len - 1);
            // 最大值不在最后
            if (maxValIndex != len - 1) {
                reverseArr(arr, 0, maxValIndex);
                res.add(maxValIndex + 1);
                reverseArr(arr, 0, len - 1);
                res.add(len);
            }
            len--;
        }
        return res;
    }

    public static int findMaxValIndex(int[] arr, int end) {
        int res = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[res]) res = i;
        }
        return res;
    }

    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
