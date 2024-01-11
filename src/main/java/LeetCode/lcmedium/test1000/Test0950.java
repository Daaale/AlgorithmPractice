package LeetCode.lcmedium.test1000;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Dale
 * @create 2023-04-03 12:10
 * @description
 */
public class Test0950 {
    public static void main(String[] args) {
        int[] deck = {17,13,11,2,3,5,7};
        int[] res = deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(res));
    }
    public static int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);
        int[] ans = new int[N];
        Arrays.sort(deck);
        for (int card: deck) {
            // 拿出最上面的元素并返回
            ans[index.pollFirst()] = card;
            if (!index.isEmpty()) {
                // 拿出最上面的元素并返回
                Integer integer = index.pollFirst();
                // 将最上面的元素放到最下面
                index.add(integer);
            }
        }
        return ans;
    }
}
