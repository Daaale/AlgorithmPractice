package programmer.String;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-14 10:09
 * @description
 */
public class Test0344 {
    public static void main(String[] args) {
        String s = "hello";
        char[] chars = s.toCharArray();
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }
    public static void reverseString(char[] chars) {
        int middle = chars.length / 2;
        for (int i=0 ; i<middle ; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
    }
}
