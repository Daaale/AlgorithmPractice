package LeetCode.lceasy.test1000;

/**
 * @author Dale
 * @create 2022-11-16 12:30
 * @description
 */
public class Test0125 {
    public static void main(String[] args) {
        String s = "0P";
        boolean res = isPalindrome(s);
        System.out.println(res);
    }
    public static boolean isPalindrome(String s) {
        //1.去掉非字母字符
        StringBuilder sb = new StringBuilder();
        for (int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')||(c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        //2.全部小写
        String str = sb.toString().toLowerCase();
        //3.验证回文
        int left = 0;
        int right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left ++;
                right --;
            }
        }
        return true;
    }
}
