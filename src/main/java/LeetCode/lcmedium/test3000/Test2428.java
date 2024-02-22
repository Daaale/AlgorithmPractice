package LeetCode.lcmedium.test3000;

public class Test2428 {
    public static void main(String[] args) {
        int[][] grid = {{6,2,1,3},{4,2,1,5},{9,2,8,7},{4,1,2,9}};
        int res = maxSum(grid);
        System.out.println(res);
    }
    public static int maxSum(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {
                int temp = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                        + grid[i + 1][j + 1]
                        + grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                if (temp > max) max = temp;
            }
        }
        return max;
    }
}
