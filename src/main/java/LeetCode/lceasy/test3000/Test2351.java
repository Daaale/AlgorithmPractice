package LeetCode.lceasy.test3000;

/**
 * @author Dale
 * @create 2022-12-04 17:19
 * @description
 */
public class Test2351 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        char res = repeatedCharacter(s);
        System.out.println(res);
    }
    public static char repeatedCharacter(String s) {
        char res = 'a';
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cnt[c - 'a'] ++;
            if (cnt[c - 'a'] > 1) {
                res = c;
                break;
            }
        }
        return res;
    }
}
