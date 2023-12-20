package LeetCode.lceasy;

import java.util.ArrayList;
import java.util.List;

public class Test2828 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";
        boolean res = isAcronym(words, s);
        System.out.println(res);
    }
    public static boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) return false;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
