package LeetCode.lceasy.test2000;

import java.util.ArrayDeque;

public class Test1700 {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        int res = countStudents(students, sandwiches);
        System.out.println(res);
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < students.length; i++) {
            deque.addLast(students[i]);
        }

        for (int i = 0; i < sandwiches.length; i++) {
            for (int j = 0; j < deque.size(); j++) {
                Integer first = deque.getFirst();
                if (first == sandwiches[i]) {
                    deque.removeFirst();
                    break;
                } else {
                    Integer removed = deque.removeFirst();
                    deque.addLast(removed);
                }
                if (j == deque.size() - 1) {
                    return deque.size();
                }
            }
        }
        return 0;
    }
}
