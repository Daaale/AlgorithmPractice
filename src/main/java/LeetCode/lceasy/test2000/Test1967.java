package LeetCode.lceasy.test2000;

public class Test1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        int res = numOfStrings(patterns, word);
        System.out.println(res);
    }
    public static int numOfStrings(String[] patterns, String word) {
        int res = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) res ++;
        }
        return res;
    }
}
