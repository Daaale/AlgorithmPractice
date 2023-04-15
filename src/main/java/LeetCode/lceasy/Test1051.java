package LeetCode.lceasy;

import java.util.Arrays;

/**
 * @Author Dale
 * @Date 2023/3/14 22:23
 * @Description
 */
public class Test1051 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        int res = heightChecker(heights);
        System.out.println(res);
    }
    public static int heightChecker(int[] heights) {
        int[] copy = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            copy[i] = heights[i];
        }
        Arrays.sort(copy);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i]) res ++;
        }
        return res;
    }
}
