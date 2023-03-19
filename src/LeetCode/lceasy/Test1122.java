package LeetCode.lceasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Dale
 * @create 2023-03-19 9:15
 * @description
 */
public class Test1122 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] res = relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] cnts = new int[1001];
        for (int i = 0; i < arr1.length; i++) {
            cnts[arr1[i]] ++;
        }
        ArrayList<Integer> list = new ArrayList<>();
        // 添加出现过的
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < cnts[arr2[i]]; j++) {
                list.add(arr2[i]);
            }
            cnts[arr2[i]] = 0;
        }
        // 未出现过的升序排列
        ArrayList<Integer> listOrder = new ArrayList<>();
        for (int i = 0; i < cnts.length; i++) {
            int cnt = cnts[i];
            for (int j = 0; j < cnt; j++) {
                listOrder.add(i);
            }
        }
        Collections.sort(listOrder);
        int[] res = new int[arr1.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        for (int i = 0; i < listOrder.size(); i++) {
            res[i + list.size()] = listOrder.get(i);
        }
        return res;
    }
}
