package LeetCode.lcmedium;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-28 18:36
 * @description
 */
public class Test1828 {
    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};
        int[] res = countPoints(points, queries);
        System.out.println(Arrays.toString(res));
    }
    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            for (int j = 0; j < queries.length; j++) {
                int dis = (x - queries[j][0]) * (x - queries[j][0]) +
                        (y - queries[j][1]) * (y - queries[j][1]);
                if (dis <= queries[j][2] * queries[j][2]) {
                    res[j] ++;
                }
            }
        }
        return res;
    }
}
