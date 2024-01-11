package LeetCode.lceasy.test2000;

/**
 * @author Dale
 * @create 2023-03-19 9:08
 * @description
 */
public class Test1189 {
    public static void main(String[] args) {
        String text = "nlaebolko";
        int res = maxNumberOfBalloons(text);
        System.out.println(res);
    }

    public static int maxNumberOfBalloons(String text) {
        String balloon = "balloon";
        int[] cnts = new int[26];
        for (int i = 0; i < balloon.length(); i++) {
            cnts[balloon.charAt(i) - 'a'] ++;
        }
        int res = 0;
        int[] textCnts = new int[26];
        for (int i = 0; i < text.length(); i++) {
            textCnts[text.charAt(i) - 'a'] ++;
        }
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < 26; i++) {
                textCnts[i] -= cnts[i];
                if (textCnts[i] < 0) {
                    flag = false;
                    break;
                }
                if (i == 25) {
                    res ++;
                }
            }
        }
        return res;
    }
}
