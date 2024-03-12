package LeetCode.lcmedium.test2000;

import java.util.Arrays;

public class Test1314 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 1;
        int[][] res = matrixBlockSum(mat, k);
        System.out.println(Arrays.toString(res[0]));
    }
    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                for (int l = i - k; l <= i + k ; l++) {
                    for (int m = j - k; m <= j + k; m++) {
                        if (l >= 0 && l < mat.length && m >= 0 && m < mat[0].length)
                            res[i][j] += mat[l][m];
                    }
                }
            }
        }
        return res;
    }
}
