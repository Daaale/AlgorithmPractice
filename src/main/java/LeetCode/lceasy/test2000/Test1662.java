package LeetCode.lceasy.test2000;

/**
 * @Author Dale
 * @Date 2022/12/3 18:43
 * @Description
 */
public class Test1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean res = arrayStringsAreEqual(word1, word2);
        System.out.println(res);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sb1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            sb2.append(word2[i]);
        }
        if (sb1.length() != sb2.length()) {
            return false;
        } else {
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
