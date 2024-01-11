package LeetCode.lceasy.test1000;

import java.util.HashSet;

/**
 * @author Dale
 * @create 2023-03-19 9:44
 * @description
 */
public class Test0575 {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        int res = distributeCandies(candyType);
        System.out.println(res);
    }
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int cnt = candyType.length / 2;
        for (int i = 0; i < candyType.length; i++) {
            if (!set.contains(candyType[i])) {
                set.add(candyType[i]);
                cnt --;
            }
            if (cnt == 0) {
                break;
            }
        }
        return candyType.length / 2 - cnt;
    }
}
