package LeetCode.lceasy.test1000;

import org.apache.commons.collections4.SplitMapUtils;

/**
 * @author Dale
 * @create 2023-05-07 12:59
 * @description
 */
public class Test0762 {
    public static void main(String[] args) {
        int left = 10;
        int right = 15;
        int res = countPrimeSetBits(left, right);
        System.out.println(res);
    }
    public static int countPrimeSetBits(int left, int right) {
        int res = 0;
        for (int i = left; i <= right; i++) {
            int num = 0;
            // 变成二进制
            String s = Integer.toString(i, 2);
            // 计算二进制中1的数据
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    num ++;
                }
            }
            if (isPrime(num)) {
                res ++;
                System.out.println(s + " " + i);
            }
        }
        return res;
    }

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        if (num == 2) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
