package LeetCode.easy;

/**
 * @Author Dale
 * @Date 2022/12/3 13:37
 * @Description
 */
public class Test1486 {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        int res = xorOperation(n, start);
        System.out.println(res);
    }
    public static int xorOperation(int n, int start) {
        int res = start;
        for (int i = 1; i < n; i++) {
            res = res ^ (start + 2 * i);
        }
        return res;
    }
}
