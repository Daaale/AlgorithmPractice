package LeetCode.lcmedium.test2000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Dale
 * @create 2023-04-15 14:33
 * @description
 */
public class Test1282 {
    public static void main(String[] args) {
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> res = groupThePeople(groupSizes);
        System.out.println(res);
    }
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        int cnt = groupSizes.length;
        while (cnt > 0) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = 0;
            for (int i = 0; i < groupSizes.length; i++) {
                //说明该数还没有被处理
                if (size == 0 && groupSizes[i] > 0) {
                    size = groupSizes[i];
                }
                // 能被处理
                if (size != 0 && list.size() != size && groupSizes[i] == size) {
                    list.add(i);
                    groupSizes[i] = -1;
                    cnt --;
                }
            }
            if (size != 0) res.add(list);
        }

        return res;
    }
}
