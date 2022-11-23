package Company.Jinshanyun;

import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2022/11/20 19:55
 * @Description
 */
public class Test01 {
    public static void main(String[] args) {
//        String str = "Who are Are you";
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = removeDup(str);
        System.out.println(res);
    }

    private static String removeDup(String str) {
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" ");
        String temp = "";
        if (split.length > 0) {
            sb.append(split[0]);
            temp = split[0].toLowerCase();
        }
        for (int i = 1; i < split.length; i++) {
            //1.保存当前字符串
            String s = split[i].toLowerCase();
            //2.判断是否相同
            if (temp.equals(s)) {
                //相同---跳过
                continue;
            } else {
                //不相同---添加 + 更换temp
                sb.append(" ");
                sb.append(split[i]);
                temp = s;
            }
        }
        return sb.toString();
    }
}
