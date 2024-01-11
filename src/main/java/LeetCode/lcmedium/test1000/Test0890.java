package LeetCode.lcmedium.test1000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author Dale
 * @Date 2023/5/27 15:42
 * @Description
 */
public class Test0890 {
    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> res = findAndReplacePattern(words, pattern);
        System.out.println(res);
    }
    public static List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() != pattern.length()) {
                continue;
            }
            HashMap<Character, Character> map = new HashMap<>();
            boolean flag = true;
            for (int j = 0; j < pattern.length(); j++) {
                if (map.containsKey(pattern.charAt(j))) {
                    char c = map.get(pattern.charAt(j));
                    if (c != word.charAt(j)) {
                        flag = false;
                        break;
                    }
                } else {
                    // 判断是否有重复的value
                    if (map.containsValue(word.charAt(j))) {
                        flag = false;
                        break;
                    }
                    map.put(pattern.charAt(j), word.charAt(j));
                }
            }
            if (flag) {
                res.add(word);
            }
        }

        return res;
    }
}
