package LeetCode.lceasy.test2000;

public class Test1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String res = truncateSentence(s, k);
        System.out.println(res);
    }
    public static String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        for (int i = 0; i < k; i++) {
            sb.append(split[i]);
            if (i < k - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
