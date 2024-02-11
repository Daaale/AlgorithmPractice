package LeetCode.lceasy.test3000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Dale
 * @Date 2024/2/10 15:42
 * @Description
 */
public class Test2160 {
    public static void main(String[] args) {
        int num = 2932;
        int res = minimumSum(num);
        System.out.println(res);
    }
    public static int minimumSum(int num) {

        String s = String.valueOf(num);
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character c1, Character c2) {
                return c1 - c2;
            }
        });
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb1.append(list.get(i));
            if (i < list.size() - 1) {
                i ++;
                sb2.append(list.get(i));
            }
        }
        return Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString());
    }
}
