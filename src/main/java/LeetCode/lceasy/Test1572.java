package LeetCode.lceasy;

public class Test1572 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int res = diagonalSum(mat);
        System.out.println(res);
    }
    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int length = mat[0].length;
        for (int i = 0; i < length; i++) {
            res += mat[i][i];
            if (i != length - i - 1) {
                res += mat[i][length - i - 1];
            }
        }
        return res;
    }
}
