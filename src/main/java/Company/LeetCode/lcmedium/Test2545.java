package Company.LeetCode.lcmedium;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Dale
 * @create 2023-03-28 19:35
 * @description
 */
public class Test2545 {
    public static void main(String[] args) {
        int[][] score = {{10,6,9,1},{7,5,11,2},{4,8,3,15}};
        int k = 2;
        int[][] res = sortTheStudents(score, k);
        System.out.println(Arrays.toString(res));
    }
    public static int[][] sortTheStudents(int[][] score, int k) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int[] ints : score) {
            map.put(ints[k], ints);
        }
        Set<Integer> set = map.keySet();
        List<Integer> collect = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for (int i = 0; i < score.length; i++) {
            score[i] = map.get(collect.get(i));
        }
        return score;
    }
}
