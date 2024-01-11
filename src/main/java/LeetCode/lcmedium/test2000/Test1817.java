package LeetCode.lcmedium.test2000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Test1817 {
    public static void main(String[] args) {
        int[][] logs = {{0,5},{1,2},{0,2},{0,5},{1,3}};
        int k = 5;
        int[] res = findingUsersActiveMinutes(logs, k);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < logs.length; i++) {
            int id = logs[i][0];
            int time = logs[i][1];
            if (!map.containsKey(id)) {
                map.put(id, new HashMap<Integer, Integer>());
            }
            HashMap<Integer, Integer> map_t = map.get(id);
            if (!map_t.containsKey(time)) {
                map_t.put(time, 1);
            } else {
                map_t.put(time, map_t.get(time) + 1);
            }
        }
        // 统计
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            // 找到活跃分钟数量
            HashMap<Integer, Integer> map1 = map.get(next);
            res[map1.keySet().size() - 1] ++;
        }
        return res;
    }
}
