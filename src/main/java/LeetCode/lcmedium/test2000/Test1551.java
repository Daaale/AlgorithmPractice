package LeetCode.lcmedium.test2000;

public class Test1551 {
    public static void main(String[] args) {
        int n = 3;
        int res = minOperations(n);
        System.out.println(res);
    }
    public static int minOperations(int n) {
        // 1 3 5 --- 3
        // 1 3 5 7 9 11 --- 6
        int sum = 0;
        for (int i = 0; i < (n + 1) / 2; i++) {
            sum += (n -  (2 * i + 1));
        }
        return sum;
    }
}
