package LeetCode.lceasy;

/**
 * @Author Dale
 * @Date 2023/12/7 13:38
 * @Description
 */
public class Test2278 {
    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';
        int res = percentageLetter(s, letter);
        System.out.println(res);
    }
    public static int percentageLetter(String s, char letter) {;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (letter == s.charAt(i)) {
                cnt ++;
            }
        }
        return cnt * 100 / s.length();
    }
}
