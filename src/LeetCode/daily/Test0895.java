package LeetCode.daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Dale
 * @Date 2022/11/30 20:23
 * @Description
 */
public class Test0895 {
    public static void main(String[] args) {
        FreqStack obj = new FreqStack();
        obj.push(5);
        obj.push(7);
        obj.push(5);
        obj.push(7);
        obj.push(4);
        obj.push(5);
        int res1 = obj.pop();
        System.out.println(res1);
        int res2 = obj.pop();
        System.out.println(res2);
    }
    static class FreqStack {
        Map<Integer, List<Integer>> map;//出现次数---对应的元素 list
        Map<Integer, Integer> cnts;//元素---出现次数
        int max;
        public FreqStack() {
            this.map = new HashMap<>();
            this.cnts = new HashMap<>();
        }

        public void push(int val) {
            // 首先添加 对应 val 的次数 +1
            cnts.put(val, cnts.getOrDefault(val, 0) + 1);
            // 其次获取次数
            int c = cnts.get(val);
            // 获取次数对应的list
            List<Integer> list = map.getOrDefault(c, new ArrayList<>());
            // 将该 val 添加到出现次数对应的 list
            list.add(val);
            // 放回 map 中
            map.put(c, list);
            // 判断更换max 最大次数
            max = Math.max(max, c);
        }

        public int pop() {
            // 首先获取最大出现次数所在的 list
            List<Integer> list = map.get(max);
            // 从 list 中移除最后添加的元素
            int ans = list.remove(list.size() - 1);
            // 修改该元素的出现次数，即 -1
            cnts.put(ans, cnts.get(ans) - 1);
            // 修改最大出现次数
            if (list.size() == 0) max--;
            return ans;
        }
    }
}
