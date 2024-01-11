package LeetCode.lceasy.test2000;

/**
 * @author Dale
 * @create 2023-03-19 8:49
 * @description
 */
public class Test1160 {
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";
        int res = countCharacters(words, chars);
        System.out.println(res);
    }
    public static int countCharacters(String[] words, String chars) {
        int[] ints = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            char c = chars.charAt(i);
            ints[c - 'a'] ++;
        }
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] wordNums = new int[26];
            boolean flag = true;
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                wordNums[c - 'a'] ++;
                if (wordNums[c - 'a'] > ints[c - 'a']) {
                    flag = false;
                }
            }
            if (flag) {
                res += word.length();
            }
        }
        return res;
    }
}
