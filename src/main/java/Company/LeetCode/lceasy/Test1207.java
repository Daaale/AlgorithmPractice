package Company.LeetCode.lceasy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ResourceBundle;

/**
 * @author Dale
 * @create 2023-03-19 17:37
 * @description
 */
public class Test1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int[] cnts = new int[2000];
        for (int i = 0; i < arr.length; i++) {
            cnts[arr[i] + 1000] ++;
        }
        Arrays.sort(cnts);
        // 从后往前遍历 判断是否有相同的数
        for (int i = 1998; i >= 0 ; i--) {
            if (cnts[i] == 0) break;
            if (cnts[i] == cnts[i + 1]) return false;
        }
        return true;
    }
}
