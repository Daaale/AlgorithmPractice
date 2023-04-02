package Company.xiecheng;

/**
 * @author Dale
 * @create 2023-03-29 19:02
 * @description
 */
import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        int n = 25; // 替换为要寻找x和y的数字
        int x = findX(n);
        int y = (n + x - 1) / x; // 取整除 - 向上取整
        System.out.println("x = " + x + ", y = " + y);
    }

    private static int findX(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int sqrtN = (int) Math.sqrt(n);
        for (int i = sqrtN; i >= 2; i--) {
            if (n % i == 0) {
                int j = n / i;
                if (j == 2) {
                    continue;
                }
                if (i % 2 == 0 && j % 2 == 0) {
                    continue;
                }
                return i;
            }
        }
        return 1;
    }
}