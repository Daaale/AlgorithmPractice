package LeetCode.lceasy.test1000;

import org.hamcrest.core.Is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test0500 {
    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] res = findWords(words);
        System.out.println(Arrays.toString(res));
    }
    public static String[] findWords(String[] words) {
        String line1 = "qwertyuiop";
        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i < line1.length(); i++) {
            set1.add(line1.charAt(i));
        }
        String line2 = "asdfghjkl";
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < line2.length(); i++) {
            set2.add(line2.charAt(i));
        }
        String line3 = "zxcvbnm";
        HashSet<Character> set3 = new HashSet<>();
        for (int i = 0; i < line3.length(); i++) {
            set3.add(line3.charAt(i));
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String s = new String(words[i]).toLowerCase();
            boolean flag1 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            for (int j = 0; j < s.length(); j++) {
                if (set1.contains(s.charAt(j))) {
                    flag1 = true;
                }
                if (set2.contains(s.charAt(j))) {
                    flag2 = true;
                }
                if (set3.contains(s.charAt(j))) {
                    flag3 = true;
                }
            }
            int cnt = 0;
            if (flag1) cnt ++;
            if (flag2) cnt ++;
            if (flag3) cnt ++;
            if (cnt <= 1) list.add(words[i]);
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
