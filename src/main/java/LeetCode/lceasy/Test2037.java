package LeetCode.lceasy;

import java.util.Arrays;
import java.util.Map;

/**
 * @author Dale
 * @create 2023-03-12 15:04
 * @description
 */
public class Test2037 {
    public static void main(String[] args) {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int res = minMovesToSeat(seats, students);
        System.out.println(res);
    }
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < students.length; i++) {
            res += Math.abs(students[i] - seats[i]);
        }
        return res;
    }
}
