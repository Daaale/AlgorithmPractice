package LeetCode.lceasy;

/**
 * @Author Dale
 * @Date 2022/12/3 18:39
 * @Description
 */
public class Test1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
    public static int maximumWealth(int[][] accounts) {
        int max = -1;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
