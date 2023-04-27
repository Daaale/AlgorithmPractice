package Company.LeetCode.lcmedium;

import java.util.ArrayList;

/**
 * @Author Dale
 * @Date 2022/12/3 18:55
 * @Description
 */
public class Test0057 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        // 新式写法
        ArrayList<int[]> res = new ArrayList<>();
        int len = intervals.length;
        int i = 0;
        // 判断左边不重合的区域
        while (i < len && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }
        // 下面将是判断重合的区域，因为不重合的区域已经在上面处理了
        // 判断重合的区域
        // 重合的部分最后合并成一个区域---重要
        while (i < len && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        res.add(newInterval);
        // 判断右边不重合
        while (i < len && intervals[i][0] > newInterval[1]) {
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[0][]);
    }
}
