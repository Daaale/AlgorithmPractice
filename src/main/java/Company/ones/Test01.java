package Company.Ones;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Dale
 * @create 2022-11-19 19:58
 * @description
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int res = getMaxWords(str);
        System.out.println(res);
    }

    private static int getMaxWords(String str) {

        HashSet<Character> baseSet = new HashSet<>();
        baseSet.add('a');
        baseSet.add('e');
        baseSet.add('i');
        baseSet.add('o');
        baseSet.add('u');

        //统计元音和辅音的个数
        int a = 0;//元音个数
        int b = 0;//辅音个数
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (baseSet.contains(temp)) {
                a ++;
            } else {
                b ++;
            }
        }
        //计算
        if (a >= b - 1) {
            return a + b;
        } else {
            return 2 * a + 1;
        }
    }
}
