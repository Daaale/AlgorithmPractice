package LeetCode.lceasy.test2000;

/**
 * @author Dale
 * @create 2022-12-04 17:14
 * @description
 */
public class Test1688 {
    public static void main(String[] args) {
        int n = 7;
        int res = numberOfMatches(n);
        System.out.println(res);
    }
    public static int numberOfMatches(int n) {
        if (n == 0 || n == 1) return 0;
        if (n % 2 == 0) {
            return n / 2 + numberOfMatches(n / 2);
        } else {
            return (n - 1) / 2 + numberOfMatches((n - 1) / 2 + 1);
        }
    }
}
