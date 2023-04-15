package LeetCode.lceasy;

/**
 * @author Dale
 * @create 2023-03-23 9:20
 * @description
 */
public class Test1266 {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        int res = minTimeToVisitAllPoints(points);
        System.out.println(res);
    }
    public static int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int disX = Math.abs(points[i - 1][0] - points[i][0]);
            int disY = Math.abs(points[i - 1][1] - points[i][1]);
            while (disX != 0 && disY != 0) {
                disX --;
                disY --;
                res ++;
            }
            if (disX == 0) res += disY;
            if (disY == 0) res += disX;
        }
        return res;
    }
}
