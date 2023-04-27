package Company.LeetCode.daily;

/**
 * @author Dale
 * @create 2023-04-21 23:54
 * @description
 */
public class Test2413 {
    public static void main(String[] args) {
        int n = 6;
        int res = smallestEvenMultiple(n);
        System.out.println(res);
    }
    public static int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n * 2;
        }
    }
}
