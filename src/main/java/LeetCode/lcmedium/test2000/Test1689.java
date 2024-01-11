package LeetCode.lcmedium.test2000;

/**
 * @author Dale
 * @create 2023-04-06 22:56
 * @description
 */
public class Test1689 {
    public static void main(String[] args) {
        String n = "32";
        int res = minPartitions(n);
        System.out.println(res);
    }
    public static int minPartitions(String n) {
        int res = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (res < c - '0') {
                res = c - '0';
            }
        }
        return res;
    }
}
