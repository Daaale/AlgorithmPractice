package LeetCode.lcmedium.test1000;

import java.util.HashSet;

public class Test0791 {
    public static void main(String[] args) {
        String order = "kqep";
        String s = "pekeq";
        String res = customSortString(order, s);
        System.out.println(res);
    }
    public static String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder();
        // 记录order中字符
        int[] cnts_s = new int[27];
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            cnts_s[s.charAt(i) - 'a'] ++;
            set.add(s.charAt(i));
        }
        int[] cnts_order = new int[27];
        for (int i = 0; i < order.length(); i++) {
            if (set.contains(order.charAt(i))) {
                for (int j = 0; j < cnts_s[order.charAt(i) - 'a']; j++) {
                    cnts_order[order.charAt(i) - 'a'] ++;
                    sb.append(order.charAt(i));
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (cnts_order[s.charAt(i) - 'a'] > 0) {
                cnts_order[s.charAt(i) - 'a'] --;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
