package LeetCode.lceasy;

/**
 * @author Dale
 * @create 2023-07-23 14:50
 * @description
 */
public class Test0171 {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        int res = titleToNumber(columnTitle);
        System.out.println(res);
    }
    public static int titleToNumber(String columnTitle) {
        int res = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int sum = 1;
            for (int j = 0; j < i; j++) {
                sum = sum * 26;
            }
            char c = columnTitle.charAt(columnTitle.length() - 1 - i);
            int cnt = c - 'A' + 1;
            res += cnt * sum;
        }

        return res;
    }
}
