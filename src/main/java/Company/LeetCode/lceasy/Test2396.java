package Company.LeetCode.lceasy;

/**
 * @author Dale
 * @create 2022-11-27 13:13
 * @description
 */
public class Test2396 {
    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if (!isPalindromic(i, n)) return false;
        }
        return true;
    }

    /**
     * 判断 i 进制下是否是回文的
     * @param i
     * @param n
     * @return
     */
    private static boolean isPalindromic(int i, int n) {
        StringBuilder sb = new StringBuilder();
        while (n / i > 0) {
            sb.append(n % i);
            n = n / i;
        }
        sb.append(n);

        for (int j = 0; j < sb.length() / 2; j++) {
            if (sb.charAt(j) != sb.charAt(sb.length() - 1 - j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        boolean res = isStrictlyPalindromic(n);
        System.out.println(res);
    }
}
