package LeetCode.daily;


/**
 * @author Dale
 * @create 2023-02-13 15:02
 * @description
 */
public class Test1234 {
    public static void main(String[] args) {
        String s = "WWEQERQWQWWRWWERQWEQ";
//        String s = "WQWRQQQW";
        int res = balancedString(s);
        System.out.println(res);
    }
    public static int balancedString(String s) {
        int res = 0;
        int num = s.length() / 4;
        int[] cnt = new int[4];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'Q') cnt[0] ++;
            if (c == 'W') cnt[1] ++;
            if (c == 'E') cnt[2] ++;
            if (c == 'R') cnt[3] ++;
        }
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > num) {
                cnt[i] -= num;
            } else {
                cnt[i] = 0;
            }
        }
        if (cnt[0] == 0 && cnt[1] == 0 && cnt[2] == 0 && cnt[3] == 0) return 0;
        // 找到包含cnt个数的最小子串长度
        // 双指针
        int[] ints = new int[4];
        int left = 0;
        int right = 0;
        int maxTemp = Integer.MAX_VALUE;
        while (right < s.length()) {
            for (; right < s.length(); right++) {
                char c = s.charAt(right);
                if (c == 'Q') ints[0] ++;
                if (c == 'W') ints[1] ++;
                if (c == 'E') ints[2] ++;
                if (c == 'R') ints[3] ++;
                if (calNums(ints, cnt)) {
                    // 符合要求---记录 + 跳出循环
                    right++;
                    maxTemp = maxTemp < right - left ? maxTemp : right - left;
                    break;
                }
            }
            for (; left < right; left++) {
                char c = s.charAt(left);
                if (c == 'Q') ints[0] --;
                if (c == 'W') ints[1] --;
                if (c == 'E') ints[2] --;
                if (c == 'R') ints[3] --;
                if (calNums(ints, cnt)) {
                    // 符合要求---记录 + 跳出循环
                    maxTemp = maxTemp < right - left - 1 ? maxTemp : right - left - 1;
                } else {
                    left++;
                    break;
                }
            }
        }
        return maxTemp;
    }

    // 计算子串是否满足要求
    private static boolean calNums(int[] ints, int[] cnt) {
        for (int i = 0; i < 4; i++) {
            if (ints[i] < cnt[i]) return false;
        }
        return true;
    }
}
