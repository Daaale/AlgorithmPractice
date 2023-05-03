package LeetCode.daily;

/**
 * @author Dale
 * @create 2023-05-03 20:58
 * @description
 */
public class Test1003 {
    public static void main(String[] args) {
        String s = "abcabcababcc";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
    public static boolean isValid(String s) {
        boolean res = true;
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > 0) {
            // 循环遍历一次，找到一个abc
            // 找不到就跳出循环
            boolean flag = false;
            for (int i = 0; i < sb.length() - 2; i++) {
                char a = sb.charAt(i);
                char b = sb.charAt(i + 1);
                char c = sb.charAt(i + 2);
                if (a == 'a' && b == 'b' && c == 'c') {
                    // 找到
                    flag = true;
                    sb = sb.delete(i, i + 3);
                    break;
                }
            }
            if (!flag) {
                res = false;
                break;
            }
        }
        return res;
    }
}
