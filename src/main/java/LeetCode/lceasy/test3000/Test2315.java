package LeetCode.lceasy.test3000;

public class Test2315 {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        int res = countAsterisks(s);
        System.out.println(res);
    }
    public static int countAsterisks(String s) {
        boolean valid = true;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '|') {
                valid = !valid;
            } else if (c == '*' && valid) {
                res++;
            }
        }
        return res;
    }
}
