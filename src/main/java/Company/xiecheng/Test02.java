package Company.xiecheng;

import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2023/3/29 19:18
 * @Description
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] res = getGoods(n, k);
        for (int i = 0; i < res.length; i++) {
            if (i == res.length - 1) {
                System.out.print(res[i]);
            } else {
                System.out.print(res[i] + " ");
            }
        }
    }

    private static int[] getGoods(int n, int k) {
        int[] res = new int[n];
        for (int i = 0, j = n - k + 1; j <= n; i = i + 2, j ++) {
            res[i] = j;
        }
        for (int i = 0, j = 1; i < n; i++) {
            if (res[i] != 0) {
                continue;
            } else {
                res[i] = j;
                j ++;
            }
        }

        return res;
    }
}
