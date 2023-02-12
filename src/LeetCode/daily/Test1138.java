package LeetCode.daily;

/**
 * @author Dale
 * @create 2023-02-12 16:09
 * @description
 */
public class Test1138 {
    public static String[] board = {"abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"};
    public static int row = 0;
    public static int column = 0;
    public static void main(String[] args) {
        String target = "zb";
        String res = alphabetBoardPath(target);
        System.out.println(res);
    }
    public static String alphabetBoardPath(String target) {
        row = 0;
        column = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);
            String str = getMinPath(c);
            res.append(str);
        }
        return res.toString();
    }

    private static String getMinPath(char c) {
        StringBuilder res = new StringBuilder();
        char a = 'D';
        int cnt_a = 0;
        char b = 'R';
        int cnt_b = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                if (c == board[i].charAt(j)) {
                    // 找到目标，计算路径
                    if (row > i) {
                        a = 'U';
                        cnt_a = row - i;
                        if (column > j) {
                            b = 'L';
                            cnt_b = column - j;
                        } else {
                            cnt_b = j - column;
                        }
                    } else {
                        cnt_a = i - row;
                        if (column > j) {
                            b = 'L';
                            cnt_b = column - j;
                        } else {
                            cnt_b = j - column;
                        }
                    }
                    if (a == 'U'){
                        for (int k = 0; k < cnt_a; k++) {
                            res.append(a);
                        }
                        for (int k = 0; k < cnt_b; k++) {
                            res.append(b);
                        }
                    } else if (b == 'L'){
                        for (int k = 0; k < cnt_b; k++) {
                            res.append(b);
                        }
                        for (int k = 0; k < cnt_a; k++) {
                            res.append(a);
                        }
                    } else {
                        for (int k = 0; k < cnt_b; k++) {
                            res.append(b);
                        }
                        for (int k = 0; k < cnt_a; k++) {
                            res.append(a);
                        }
                    }


                    res.append("!");
                    row = i;
                    column = j;
                    return res.toString();
                }
            }
        }
        return null;
    }
}
