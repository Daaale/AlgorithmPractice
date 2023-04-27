package Company.LeetCode.lceasy;

/**
 * @author Dale
 * @create 2023-04-05 20:08
 * @description
 */
public class Test1588 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int res = sumOddLengthSubarrays(arr);
        System.out.println(res);
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += getSumArr(arr, i + 1);
            }
        }
        return sum;
    }

    private static int getSumArr(int[] arr, int length) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + length <= arr.length) {
                for (int j = i; j < i + length; j++) {
                    res += arr[j];
                }
            }
        }
        return res;
    }
}
