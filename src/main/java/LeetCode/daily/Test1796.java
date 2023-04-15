package LeetCode.daily;

/**
 * @Author Dale
 * @Date 2022/12/3 13:29
 * @Description
 */
public class Test1796 {
    public static void main(String[] args) {
        String s = "dfa12321afd";
        int res = secondHighest(s);
        System.out.println(res);
    }
    public static int secondHighest(String s) {
        int max = -1;
        int second = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int temp = c - '0';
                if (max == -1) {
                    max = temp;
                } else {
                    if (max < temp) {
                        second = max;
                        max = temp;
                    } else if (max > temp) {
                        if (second == -1) {
                            second = temp;
                        } else {
                            if (second < temp) {
                                second = temp;
                            }
                        }
                    }
                }
            }
        }

        return second;
    }
}
