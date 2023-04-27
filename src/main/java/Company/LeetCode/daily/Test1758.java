package Company.LeetCode.daily;

/**
 * @Author Dale
 * @Date 2022/11/29 15:15
 * @Description
 */
public class Test1758 {
    public static void main(String[] args) {
        String s = "0100";
        int res = minOperations(s);
        System.out.println(res);
    }
    public static int minOperations(String s) {
        int res0 = 0;
        int res1 = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 48;
            if (c != i % 2) {
                res0 ++;
            }
            if (c != (i + 1) % 2) {
                res1 ++;
            }
        }
        return Math.min(res0, res1);
    }
}
