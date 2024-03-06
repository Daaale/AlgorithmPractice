package LeetCode.lcmedium.test1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.DoubleToLongFunction;

public class Test0786 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int k = 3;
        int[] res = kthSmallestPrimeFraction(arr, k);
        System.out.println(Arrays.toString(res));
    }
    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                list.add(new int[]{arr[i], arr[j]});
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o2[1] - o2[0] * o1[1];
            }
        });
        return list.get(k - 1);
    }
}
