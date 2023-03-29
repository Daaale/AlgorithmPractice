package LeetCode.lceasy;

import java.util.*;

/**
 * @author Dale
 * @create 2023-03-29 16:29
 * @description
 */
public class Test1773 {
    public static void main(String[] args) {
        ArrayList<List<String>> items = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("phone");
        list1.add("blue");
        list1.add("pixel");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("computer");
        list2.add("silver");
        list2.add("lenovo");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("phone");
        list3.add("gold");
        list3.add("iphone");
        items.add(list1);
        items.add(list2);
        items.add(list3);
        String ruleKey = "color";
        String ruleValue = "silver";
        int res = countMatches(items, ruleKey, ruleValue);
        System.out.println(res);

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        int num = 0;
        if (ruleKey.equals("color")) num = 1;
        if (ruleKey.equals("name")) num = 2;
        for (int i = 0; i < items.size(); i++) {
            List<String> list = items.get(i);
            if (list.get(num).equals(ruleValue)) {
                res ++;
            }
        }
        return res;
    }

}
