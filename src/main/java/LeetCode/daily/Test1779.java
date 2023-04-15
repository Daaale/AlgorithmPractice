package LeetCode.daily;

/**
 * @Author Dale
 * @Date 2022/12/1 15:16
 * @Description
 */
public class Test1779 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int[][] points = {{1,2},{3,1},{2,4},{2,3},{4,4}};
        int res = nearestValidPoint(x, y, points);
        System.out.println(res);
    }
    public static int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 0; i < points.length; i++) {
            // 1.判断是否是曼哈顿有效点
            if (points[i][0] == x || points[i][1] == y) {
                // 2.获取曼哈顿距离
                int dis = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                // 3.判断是否是最小值
                if (dis < min) {
                    min = dis;
                    res = i;
                }
            }
        }

        return res;
    }
}
