package LeetCode.lceasy.test3000;

public class Test2651 {
    public static void main(String[] args) {
        int arrivalTime = 15;
        int delayedTime = 5;
        int res = findDelayedArrivalTime(arrivalTime, delayedTime);
        System.out.println(res);
    }
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
