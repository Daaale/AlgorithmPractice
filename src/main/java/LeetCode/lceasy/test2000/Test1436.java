package LeetCode.lceasy.test2000;

import java.util.*;

public class Test1436 {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("New York");
        List<String> list2 = new ArrayList<>();
        list2.add("New York");
        list2.add("Lima");
        List<String> list3 = new ArrayList<>();
        list3.add("Lima");
        list3.add("Sao Paulo");
        paths.add(list1);
        paths.add(list2);
        paths.add(list3);
        String res = destCity(paths);
        System.out.println(res);
    }
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        String res = "";
        for (int i = 0; i < paths.size(); i++) {
            for (int j = 0; j < paths.get(i).size() - 1; j++) {
                set.add(paths.get(i).get(j));
            }
        }
        // 处理每个线路最后一个节点
        for (int i = 0; i < paths.size(); i++) {
            String temp = paths.get(i).get(paths.get(i).size() - 1);
            if (!set.contains(temp)) {
                return temp;
            }
        }
        return res;
    }
}
