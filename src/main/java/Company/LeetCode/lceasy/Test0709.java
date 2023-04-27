package Company.LeetCode.lceasy;

/**
 * @author Dale
 * @create 2023-03-19 9:53
 * @description
 */
public class Test0709 {
    public static void main(String[] args) {
        String s = "Hello";
        String res = toLowerCase(s);
        System.out.println(res);
    }
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z'){
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
