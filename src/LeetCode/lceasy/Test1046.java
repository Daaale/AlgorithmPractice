package LeetCode.lceasy;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2023-03-15 18:20
 * @description
 */
public class Test1046 {
    public static void main(String[] args) {
        int[] nums = {2,7,4,1,8,1};
        int res = lastStoneWeight(nums);
        System.out.println(res);
    }
    public static int lastStoneWeight(int[] stones) {
        int cnt = stones.length;
        while (cnt > 1) {
            // 找到最大值和最小值
            Arrays.sort(stones);
            if (stones[stones.length - 1] == stones[stones.length - 2]) {
                cnt -= 2;
                stones[stones.length - 1] = 0;
                stones[stones.length - 2] = 0;
            } else {
                cnt -= 1;
                stones[stones.length - 1] -= stones[stones.length - 2];
                stones[stones.length - 2] = 0;
            }
        }
        Arrays.sort(stones);
        return stones[stones.length - 1];
    }
}
