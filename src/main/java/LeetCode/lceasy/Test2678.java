package LeetCode.lceasy;

public class Test2678 {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int res = countSeniors(details);
        System.out.println(res);
    }
    public static int countSeniors(String[] details) {
        int cnt = 0;
        for (int i = 0; i < details.length; i++) {
            String substring = details[i].substring(11, 13);
            Integer value = Integer.valueOf(substring);
            if (value > 60) cnt ++;
        }
        return cnt;
    }
}
