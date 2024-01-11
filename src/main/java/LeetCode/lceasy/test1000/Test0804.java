package LeetCode.lceasy.test1000;

import java.util.HashSet;

/**
 * @Author Dale
 * @Date 2023/3/14 21:39
 * @Description
 */
public class Test0804 {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int res = uniqueMorseRepresentations(words);
        System.out.println(res);
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] passwords = {".-","-...","-.-.","-..",
                ".","..-.","--.","....","..",".---",
                "-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                sb.append(passwords[word.charAt(j) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
