package LeetCode.lceasy.test3000;

public class Test2710 {
    public static void main(String[] args) {
        String num = "51230100";
        String res = removeTrailingZeros(num);
        System.out.println(res);
    }
    public static String removeTrailingZeros(String num) {

        for (int i = num.length() - 1; i >= 0 ; i--) {
            if (num.charAt(i) != '0') {
                num = num.substring(0, i + 1);
                break;
            }
        }
        return num;
    }
}
