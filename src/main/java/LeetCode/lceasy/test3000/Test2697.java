package LeetCode.lceasy.test3000;

public class Test2697 {
    public static void main(String[] args) {
        String s = "egcfe";
        String res = makeSmallestPalindrome(s);
        System.out.println(res);
    }
    public static String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(s.length() - 1 - i);
            if (left > right) left = right;
            sb.append(left);
        }
        if (s.length() % 2 == 1) sb.append(s.charAt(s.length() / 2));
        for (int i = s.length() / 2 - 1; i >= 0; i--) {
            sb.append(sb.charAt(i));
        }
        return sb.toString();
    }
}
