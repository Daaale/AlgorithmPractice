package LeetCode.lceasy.test2000;

import java.util.Arrays;

public class Test1304 {
    public static void main(String[] args) {
        int n = 5;
        int[] res = sumZero(n);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sumZero(int n) {
        int[] res = new int[n];
        if (n % 2 == 1) n --;
        for (int i = 0; i < n; i+=2) {
            res[i] = i + 1;
            res[i + 1] = -i - 1;
        }

        return res;
    }

}
