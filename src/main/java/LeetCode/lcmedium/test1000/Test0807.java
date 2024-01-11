package LeetCode.lcmedium.test1000;

/**
 * @author Dale
 * @create 2023-03-28 18:58
 * @description
 */
public class Test0807 {
    public static void main(String[] args) {
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int res = maxIncreaseKeepingSkyline(grid);
        System.out.println(res);
    }
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int res = 0;
        // 首先找到东南的天际线
        int[] east = new int[grid.length];
        int[] south = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            east[i] = grid[i][0];
            south[i] = grid[0][i];
            for (int j = 1; j < grid[0].length; j++) {
                east[i] = Math.max(east[i], grid[i][j]);
                south[i] = Math.max(south[i], grid[j][i]);
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int temp = Math.min(east[i], south[j]);
                res += (temp - grid[i][j]);
            }
        }
        return res;
    }
}
