package LeetCode.lceasy;

public class Test0766 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean res = isToeplitzMatrix(matrix);
        System.out.println(res);
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        boolean flag = true;
        for (int i = 0; i < matrix[0].length - 1; i++) {
            int a = matrix[0][i];
            for (int j = 0; j < matrix.length && j + i < matrix[0].length; j++) {
                int b = matrix[j][j + i];
                if (a != b) {
                    flag = false;
                    break;
                }
            }
            if (!flag) break;
        }
        if (flag) {
            for (int i = 0; i < matrix.length - 1; i++) {
                int a = matrix[i][0];
                for (int j = 0; j < matrix[0].length && j + i < matrix.length; j++) {
                    int b = matrix[j + i][j];
                    if (a != b) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) break;
            }
        }
        return flag;
    }
}
