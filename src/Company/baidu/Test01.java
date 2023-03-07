package Company.baidu;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author Dale
 * @Date 2023/3/7 18:38
 * @Description
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = in.nextInt();
            nums[i] = temp;
        }
        double res = getMinSum(nums, k);
        System.out.println(res);
    }

    private static double getMinSum(int[] nums, int k) {
        if (k > nums.length) return 0;
        // 排序
        Arrays.sort(nums);
        // 使用队列，倒序排列
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        // 总和
        double sum = 0;
        // 当前的和
        double temp = 0;
        int tempCount = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double average = sum / k;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (sum + nums[i] >= average) {
                queue.offer(temp / tempCount);
                temp = 0;
                tempCount = 0;
                k --;
            }
            temp += nums[i];
            tempCount ++;
            if (k == 1) break;
        }
        // 放最后一个
        queue.offer(temp / tempCount);
        double res = 0;
        // 计算结果
        while (!queue.isEmpty()) {
            res += queue.poll();
        }
        return res;
    }
}
