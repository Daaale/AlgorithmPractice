package LeetCode.lceasy.test3000;

import java.util.ArrayList;
import java.util.List;

public class Test2942 {
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        List<Integer> list = findWordsContaining(words, x);
        System.out.println(list.get(0));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (x == words[i].charAt(j)) {
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
