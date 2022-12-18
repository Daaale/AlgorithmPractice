package LeetCode.daily;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dale
 * @create 2022-12-18 16:48
 * @description
 */
public class Test1703 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,1};
        int k = 2;
        int res = minMoves(nums, k);
        System.out.println(res);
    }
    public static int minMoves(int[] nums, int k) {
        // 计算两个1之间的0的个数
        List<Integer> zeros = new ArrayList<>();
        int z = 0;
        int i = 0;
        // 去掉左边的0
        for (; i < nums.length; i++) {
            if (nums[i] == 1) {
                i++;
                break;
            }
        }
        //统计两个1之间0的个数，从第一个1开始
        for (; i < nums.length; i++) {
            if (nums[i] == 1){
                zeros.add(z);
                z = 0;
            }else {
                z++;
            }
        }
        // 计算每个区域的cost
        int cost = 0;
        for (int j = 0; j < k-1; j++) {
            cost += zeros.get(j)*Math.min(j+1, k-j-1);
        }
        // 计算前缀和
        int[] pre = new int[zeros.size()+1];
        for (int j = 1; j <= zeros.size(); j++) {
            pre[j] += zeros.get(j-1)+pre[j-1];
        }
        int temp = cost;
        // 滑动窗口，计算最小的cost
        for (int j = k-1; j < zeros.size(); j++) {
            temp -= pre[k/2+(j-k+1)]-pre[j-k+1];
            temp += pre[j+1]-pre[k/2+(j-k+1)+k%2];
            cost = Math.min(temp, cost);
        }
        return cost;
    }
}
