package Company.xiecheng;
import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2023/3/29 19:04
 * @Description
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = getRound(str);
        System.out.println(res);
    }

    private static int getRound(String str) {
        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0' || c == '9' || c == '6') {
                res ++;
            }
            if (c == '8') {
                res += 2;
            }
        }

        return res;
    }
}
