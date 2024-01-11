package LeetCode.lcmedium.test1000;

import java.util.Arrays;

/**
 * @Author Dale
 * @Date 2022/12/5 18:14
 * @Description
 */
public class Test0048 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        System.out.println(Arrays.toString(matrix));
    }
    public static void rotate(int[][] matrix) {
        // 顺时针旋转90度
        int[][] res = new int[matrix.length][matrix.length];
        //两次赋值
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                res[j][matrix.length - 1 - i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = res[i][j];
            }
        }


    }
}
