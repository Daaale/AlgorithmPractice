package LeetCode.lceasy.test3000;

import java.util.HashMap;
import java.util.Iterator;

public class Test2085 {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        int res = countWords(words1, words2);
        System.out.println(res);
    }
    public static int countWords(String[] words1, String[] words2) {
        int res = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            map1.put(words1[i], map1.getOrDefault(words1[i], 0) + 1);
        }
        for (int i = 0; i < words2.length; i++) {
            map2.put(words2[i], map2.getOrDefault(words2[i], 0) + 1);
        }

        Iterator<String> iterator = map1.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (map1.get(next) == 1 && map2.containsKey(next) && map2.get(next) == 1)
                res ++;
        }

        return res;
    }
}
