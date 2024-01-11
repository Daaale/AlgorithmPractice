package LeetCode.lcmedium.test2000;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-28 18:53
 * @description
 */
public class Test1769 {
    public static void main(String[] args) {
        String boxes = "110";
        int[] res = minOperations(boxes);
        System.out.println(Arrays.toString(res));
    }
    public static int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            char c = boxes.charAt(i);
            if (c == '1') {
                // left
                int left = 1;
                for (int j = i - 1; j >= 0 ; j--) {
                    res[j] += left;
                    left ++;
                }
                // right
                int right = 1;
                for (int j = i + 1; j < boxes.length(); j++) {
                    res[j] += right;
                    right ++;
                }
            }
        }
        return res;
    }
}
