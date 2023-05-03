package LeetCode.lceasy;

/**
 * @author Dale
 * @create 2023-04-11 21:09
 * @description
 */
public class Test2586 {
    public static void main(String[] args) {
        String[] words = {"are","amy","u"};
        int left = 0;
        int right = 2;
        int res = vowelStrings(words, left, right);
        System.out.println(res);
    }
    public static int vowelStrings(String[] words, int left, int right) {
        String str = "aeiou";
        int res = 0;
        for (int i = left; i <= right; i++) {
            String a = String.valueOf(words[i].charAt(0));
            String b = String.valueOf(words[i].charAt(words[i].length() - 1));
            if (str.contains(a) && str.contains(b)) {
                res ++;
            }
        }
        return res;
    }
}
