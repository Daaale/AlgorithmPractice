package LeetCode.lceasy.test2000;

import java.util.HashSet;

public class Test1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean res = checkIfPangram(sentence);
        System.out.println(res);
    }
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sum ++;
            }
        }
        return sum == 26 ? true : false;
    }
}
