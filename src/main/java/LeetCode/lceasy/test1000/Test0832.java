package LeetCode.lceasy.test1000;

import java.util.Arrays;

public class Test0832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(image);
        System.out.println(Arrays.toString(res[0]));
    }
    public static int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            // 翻转每一行
            for (int j = 0; j < image[i].length / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image.length - j - 1];
                image[i][image.length - j - 1] = temp;
            }
            // 反转图片
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 0) {
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
