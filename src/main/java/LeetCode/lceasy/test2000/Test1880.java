package LeetCode.lceasy.test2000;

public class Test1880 {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";
        boolean res = isSumEqual(firstWord, secondWord, targetWord);
        System.out.println(res);
    }
    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            sb1.append(firstWord.charAt(i) - 'a');
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < secondWord.length(); i++) {
            sb2.append(secondWord.charAt(i) - 'a');
        }
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            sb3.append(targetWord.charAt(i) - 'a');
        }
        if (Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString()) == Integer.valueOf(sb3.toString())) {
            return true;
        }
        return false;
    }
}
