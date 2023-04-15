package LeetCode.lceasy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dale
 * @create 2023-03-15 19:01
 * @description
 */
public class Test1002 {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        List<String> res = commonChars(words);
        System.out.println(res);
    }
    public static List<String> commonChars(String[] words) {
        int[][] cnts = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                cnts[i][c - 'a'] ++;
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < words.length; j++) {
                if (cnts[j][i] < min) min = cnts[j][i];
            }
            if (min > 0) {
                for (int j = 0; j < min; j++) {
                    list.add(String.valueOf((char) ('a' + i)));
                }
            }
        }
        return list;
    }
}
