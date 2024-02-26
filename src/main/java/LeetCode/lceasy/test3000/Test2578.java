package LeetCode.lceasy.test3000;

import java.util.ArrayList;
import java.util.Collections;

public class Test2578 {
    public static void main(String[] args) {
        int num = 4325;
        int res = splitNum(num);
        System.out.println(res);
    }
    public static int splitNum(int num) {
        int res = 0;
        String s = String.valueOf(num);
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        Collections.sort(list);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                sb1.append(list.get(i));
            } else {
                sb2.append(list.get(i));
            }
        }

        res = Integer.valueOf(sb1.toString()) + Integer.valueOf(sb2.toString());

        return res;
    }
}
