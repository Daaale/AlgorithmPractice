package programmer.Dynamic;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-16 14:50
 * @description
 */
public class Test0063 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b'};
        String s1 = chars.toString();
        String s2 = new String(chars);
        String s3 = Arrays.toString(chars);
        String s4 = String.valueOf(chars);
        System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " ");
    }
}
