package Company.baidu;

import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2023/3/7 18:38
 * @Description
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            sb.append(scanner.nextLine());
        }
        String code = sb.toString();
        int maxDepth = 0;
        int curDepth = 0;
        boolean flag = false;
        boolean flag1 = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '{') {
                if (flag || flag1) {
                    curDepth ++;
                    if (curDepth > maxDepth) {
                        maxDepth = curDepth;
                    }
                }
            } else if (c == '}') {
                if (flag || flag1) {
                    curDepth --;
                }
                if (curDepth < 0) {
                    curDepth = 0;
                    flag = false;
                    flag1 = false;
                }
            } else if (code.startsWith("for", i)) {
                i += 3;
                while (code.charAt(i) != '(') {
                    i++;
                }
                flag = true;
            } else if (code.startsWith("if", i)) {
                i += 2;
                while (code.charAt(i) != '(') {
                    i++;
                }
                flag1 = true;
            }
        }
        System.out.println(maxDepth);
    }
}
