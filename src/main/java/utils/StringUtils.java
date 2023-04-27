package utils;

import java.util.Objects;

/**
 * @author Dale
 * @create 2023-04-28 1:03
 * @description
 */
public class StringUtils {
    public static void main(String[] args) {
        String target = "啊啊(?)";
        String str = "(?)";
        int res = count(target, str);
        System.out.println(res);
    }

    private static int count(String target, String str) {
        if (Objects.isNull(target) || target.length() < str.length()) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == str.charAt(0)) {
                boolean flag = true;
                for (int j = 0; j < str.length(); j++) {
                    if (i + j > target.length() || target.charAt(i + j) != str.charAt(j)) {
                        flag = false;
                        i = i + j - 1;
                        break;
                    }
                }
                if (flag) {
                    i = i + str.length() - 1;
                    res ++;
                }
            }
        }
        return res;
    }
}
