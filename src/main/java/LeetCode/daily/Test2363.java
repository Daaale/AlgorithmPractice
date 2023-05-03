package LeetCode.daily;

import java.util.*;

/**
 * @author Dale
 * @create 2023-02-28 16:43
 * @description
 */
public class Test2363 {
    public static void main(String[] args) {
        int[][] items1 = {{1,1},{4,5},{3,8}};
        int[][] items2 = {{3,1},{1,5}};
        List<List<Integer>> res = mergeSimilarItems(items1, items2);
        System.out.println(res.size());
    }
    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items1.length; i++) {
            map.put(items1[i][0], items1[i][1]);
        }
        for (int i = 0; i < items2.length; i++) {
            int key = items2[i][0];
            int value = items2[i][1];
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(key, value);
            }
        }
        // map转换为list
        List<List<Integer>> res = new ArrayList<>();
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(next);
            list.add(map.get(next));
            res.add(list);
        }
        Collections.sort(res, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(0) - o2.get(0);
            }
        });
        return res;
    }
}
