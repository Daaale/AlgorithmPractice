package LeetCode.lceasy.test2000;

public class Test1351 {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int res = countNegatives(grid);
        System.out.println(res);
    }
    public static int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    cnt = cnt + (grid[i].length - j);
                    break;
                }
            }
        }
        return cnt;
    }
}
