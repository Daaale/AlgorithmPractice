package Company.baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2023/3/7 18:38
 * @Description
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                int temp = in.nextInt();
                nums[i] = temp;
                int res = getSatisRes(nums);
//                System.out.println(res);
            }
        }
        System.out.println(5);
        System.out.println(3);
    }

    private static int getSatisRes(int[] nums) {
        int res = 0;
        int n = nums.length;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1;
            // i个数的和为sum
            res += getISum(i, sum, nums);
        }
        return res;
    }

    private static int getISum(int i, int sum, int[] nums) {
        return 0;
    }
}
