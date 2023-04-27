package Company.LeetCode.lceasy;

import java.util.HashSet;

/**
 * @Author Dale
 * @Date 2022/12/3 13:55
 * @Description
 */
public class Test1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int res = countConsistentStrings(allowed, words);
        System.out.println(res);
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!set.contains(words[i].charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) res ++;
        }
        return res;
    }
}
