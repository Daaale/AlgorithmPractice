package LeetCode.lceasy.test2000;

/**
 * @author Dale
 * @create 2023-04-07 19:24
 * @description
 */
public class Test1450 {
    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        int res = busyStudent(startTime, endTime, queryTime);
        System.out.println(res);
    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                res ++;
            }
        }
        return res;
    }
}
