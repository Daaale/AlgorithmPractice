package LeetCode.lceasy.test3000;

public class Test2798 {
    public static void main(String[] args) {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int res = numberOfEmployeesWhoMetTarget(hours, target);
        System.out.println(res);
    }
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int res = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) res ++;
        }
        return res;
    }
}
