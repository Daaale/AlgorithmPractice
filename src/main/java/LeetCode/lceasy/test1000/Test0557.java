package LeetCode.lceasy.test1000;

public class Test0557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String res = reverseWords(s);
        System.out.println(res);
    }
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = split[i].length() - 1; j >= 0; j--) {
                sb.append(split[i].charAt(j));
            }
            if (i != split.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
