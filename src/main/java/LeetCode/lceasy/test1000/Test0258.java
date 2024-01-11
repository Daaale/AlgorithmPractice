package LeetCode.lceasy.test1000;

/**
 * @Author Dale
 * @Date 2023/3/14 22:36
 * @Description
 */
public class Test0258 {
    public static void main(String[] args) {
        int num = 38;
        int res = addDigits(num);
        System.out.println(res);
    }
    public static int addDigits(int num) {
        while (num >= 10) {
            String value = String.valueOf(num);
            int temp = 0;
            for (int i = 0; i < value.length(); i++) {
                temp += (value.charAt(i) - '0');
            }
            num = temp;
        }
        return num;
    }
}
