package Company.LeetCode.lceasy;

import java.lang.reflect.GenericArrayType;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-12 15:13
 * @description
 */
public class Test2500 {
    public static void main(String[] args) {
        int[][] grid = {{1,2,4},{3,3,1}};
        int res = deleteGreatestValue(grid);
        System.out.println(res);
    }
    public static int deleteGreatestValue(int[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        for (int i = 0; i < grid[0].length; i++) {
            int max = -1;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > max) max = grid[j][i];
            }
            res += max;
        }
        return res;
    }
}
