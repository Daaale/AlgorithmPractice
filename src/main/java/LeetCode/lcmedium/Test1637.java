package LeetCode.lcmedium;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Dale
 * @create 2023-04-02 17:28
 * @description
 */
public class Test1637 {
    public static void main(String[] args) {
        int[][] points = {{8,7},{9,9},{7,4},{9,7}};
        int res = maxWidthOfVerticalArea(points);
        System.out.println(res);
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < points.length; i++) {
            list.add(points[i][0]);
        }
        Collections.sort(list);
        int max = -1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (max < list.get(i + 1) - list.get(i)) {
                max = list.get(i + 1) - list.get(i);
            }
        }
        return max;
    }
}
