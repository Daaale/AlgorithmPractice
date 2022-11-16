package Company.ByteDance;

/**
 * @Author Dale
 * @Date 2022/11/15 14:02
 * @Description
 */
public class Test01 {
    //下面这个是测试方法，你直接抄一下，然后点运行，
    public static void main(String[] args) {
        String num1 = "a0";
        String num2 = "13";//正常用例
        //边缘用例 "0" "0"与自身相同的用例
        //用例 不进位的用例 ""
        //用例 进位的用例 "Z" "Z"
        //
        String res = add(num1, num2);
        System.out.println(res);
    }

    private static String base = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String add(String num1, String num2) {
        String result = "";//结果
        int carry = 0;//计算过程中的结果、进位都用carry来表示
        int ptr1 = num1.length() - 1;//a输入字符串的长度
        int ptr2 = num2.length() - 1;//b输入字符串的长度
        while (ptr1 >= 0 || ptr2 >= 0 || carry != 0) {
            if (ptr1 >= 0) {
                carry += base.indexOf(num1.charAt(ptr1));//找到该字符在base中的位置，方法是indexOf，O大写
                ptr1--;//指针从后往前进行扫描
            }
            if (ptr2 >= 0) {
                carry += base.indexOf(num2.charAt(ptr2));//找到该字符在base中的位置
                ptr2--;//指针从后往前进行扫描
            }
            //carry就是相加后的base的位置，可能比base大，因此要用%算出最后的位置，将结果写在result里
            result = base.charAt(carry % base.length()) + result;
            carry /= base.length();//最后carry计算进位，进位后可以进行下一个循环的计算
        }
        return result;
    }
}
