package Company.Jinshanyun;

import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2022/11/20 19:58
 * @Description
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] split = line.split(" ");
        char x = split[0].charAt(0);
        int v = Integer.parseInt(split[1]);
        int t = Integer.parseInt(split[2]);
        int max = getMax(x, v, t);
        int min = getMin(x, v, t);
        System.out.println(max + " " + min);
    }

    private static int getMin(char x, int v, int t) {
        t = t - 3;
        int a = 0;//a 失败的次数
        int b = 0;
        int c = 0;

        if (x == 'a') {
            t = t - v;
            a = v;
            c = t / 3;
            if (t % 3 == 0) {
                b = 0;
            } else if (t % 3 == 1){
                c = c - 1;
                b = 2;
            } else {
                b = 1;
            }
        } else if (x == 'b') {
            t = t - 2 * v;
            b = v;
            c = t / 3;
            if (t % 3 == 0) {
                a = 0;
            } else if (t % 3 == 1) {
                a = 1;
            } else {
                a = 2;
            }
        } else {
            c = v;
            t = t - 3 * v;
            b = t / 2;
            if (t % 2 == 0) {
                a = 0;
            } else {
                a = 1;
            }
        }

        return a + b + c;
    }

    private static int getMax(char x, int v, int t) {
        t = t - 3;
        int a = 0;//a 失败的次数
        int b = 0;
        int c = 0;
        if (x == 'a') {
            t = t - v;
            a = v;
            b = t / 2;
            if (t % 2 == 0) {
                c = 0;
            } else {
                c = 1;
                b = b - 1;
            }
        } else if (x == 'b') {
            b = v;
            t = t - 2 * v;
            a = t;
        } else {
            c = v;
            t = t - 3 * v;
            a = t;
        }

        return a + b + c;
    }
}
