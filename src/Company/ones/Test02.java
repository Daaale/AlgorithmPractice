package Company.ones;

import java.util.Scanner;

/**
 * @author Dale
 * @create 2022-11-19 20:09
 * @description
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for (int i = 0; i < t; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            in.nextLine();
            char[][] base = new char[m][m];
            char[][] son = new char[n][n];
            for (int j = 0; j < m; j++) {
                String s = in.nextLine();
                for (int k = 0; k < s.length(); k++) {
                    base[j][k] = s.charAt(k);
                }
            }
            for (int j = 0; j < n; j++) {
                String s = in.nextLine();
                for (int k = 0; k < s.length(); k++) {
                    son[j][k] = s.charAt(k);
                }
            }
            String res = judge(base, son);
            System.out.println(res);
        }
    }

    private static String judge(char[][] base, char[][] son) {
        //遍历位置
        int pos = base.length - son.length;
        for (int i = 0; i <= pos; i++) {
            for (int j = 0; j <= pos; j++) {
                // i j 为左上顶点起始位置
                //验证从该节点开始的子矩阵
                if(judgeSon(i, j, base, son)) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    //验证从 i j 节点开始的子矩阵
    private static boolean judgeSon(int a, int b, char[][] base, char[][] son) {

        for (int i = 0; i < son.length; i++) {
            for (int j = 0; j < son.length; j++) {
                if (son[i][j] != base[i + a][j + b]) {
                    return false;
                }
            }
        }

        return true;
    }
}
