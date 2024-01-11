package LeetCode.lceasy.test2000;

/**
 * @author Dale
 * @create 2023-05-23 16:04
 * @description
 */
public class Test1281 {
    public static void main(String[] args) {
        int n = 234;
        int res = subtractProductAndSum(n);
        System.out.println(res);
    }
    public static int subtractProductAndSum(int n) {
        int a = 1;
        int b = 0;
        String s = String.valueOf(n);
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - '0';
            a = a * temp;
            b = b + temp;
        }
        return a - b;
    }
}
