package LeetCode.easy;

/**
 * @Author Dale
 * @Date 2022/12/3 13:41
 * @Description
 */
public class Test0771 {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int[] cnts = new int[1000];
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            if (c >= 'a' && c <= 'z') {
                cnts[c - 'a' + 100] ++;
            } else {
                cnts[c - 'A' + 26 + 100] ++;
            }
        }
        int res = 0;
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (cnts[c - 'A' + 26 + 100] > 0 || cnts[c - 'a' + 100] > 0) {
                res ++;
            }
        }
        return res;
    }
}
