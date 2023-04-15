package LeetCode.lcmedium;

import java.util.Arrays;
import java.util.zip.DeflaterOutputStream;

/**
 * @author Dale
 * @create 2023-03-28 17:44
 * @description
 */
public class Test0378 {
    public static void main(String[] args) {
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        int k = 8;
        int res = kthSmallest(matrix, k);
        System.out.println(res);
    }
    public static int kthSmallest(int[][] matrix, int k) {
        int[] nums = new int[matrix.length * matrix.length];
        int s = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                nums[s] = matrix[i][j];
                s ++;
            }
        }
        Arrays.sort(nums);
        return nums[k - 1];
    }
}
