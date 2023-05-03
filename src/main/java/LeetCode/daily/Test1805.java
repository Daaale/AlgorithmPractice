package LeetCode.daily;

import java.util.HashSet;

/**
 * @author Dale
 * @create 2022-12-06 18:41
 * @description
 */
public class Test1805 {
    public static void main(String[] args) {
        String word = "a123bc34d8ef34";
        int res = numDifferentIntegers(word);
        System.out.println(res);
    }
    public static int numDifferentIntegers(String word) {
        HashSet<String> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                int left = i;
                int num = 1;
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(j) >= '0' && word.charAt(j) <= '9') {
                        num ++;
                    } else {
                        break;
                    }
                }
                //切割
                String substring = word.substring(i, i + num);
                //去除前导 0
                int leftZero = 0;
                for (int j = 0; j < substring.length(); j++) {
                    if(substring.charAt(j) == '0') {
                        leftZero ++;
                    } else {
                        break;
                    }
                }
                substring = substring.substring(leftZero, substring.length());
                if (!set.contains(substring)) {
                    res ++;
                    set.add(substring);
                }
                i = i + num;
            }
        }
        return res;
    }
}
