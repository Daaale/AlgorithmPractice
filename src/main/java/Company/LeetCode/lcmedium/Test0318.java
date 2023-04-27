package Company.LeetCode.lcmedium;

import java.util.HashSet;

/**
 * @author Dale
 * @create 2023-03-21 18:46
 * @description
 */
public class Test0318 {
    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int res = maxProduct(words);
        System.out.println(res);
    }

    public static int maxProduct(String[] words) {
        int[] letters = new int[words.length];
        for (int i = 0; i < words.length; ++i) {
            int letter = 0;
            for (char c : words[i].toCharArray()) {
                // 通过位运算操作判断两个单词是否有公共字母。
                // 使用位掩码的最低26位分别表示每个字母是否在这个单词中出现
                // 将a到z分别记为0-25个字母
                // 则掩码从低位到高位的低i是1
                // 当且仅当低i个字母在这个单词
                letter |= (1 << (c - 'a'));
            }
            letters[i] = letter;
        }
        int ans = 0;
        for (int i = 0; i < words.length; ++i) {
            for (int j = i + 1; j < words.length; ++j) {
                // 判断第i个单词和第j个单词是否有公共字母
                if ((letters[i] & letters[j]) == 0) {
                    ans = Math.max(ans, words[i].length() * words[j].length());
                }
            }
        }
        return ans;
    }
}
