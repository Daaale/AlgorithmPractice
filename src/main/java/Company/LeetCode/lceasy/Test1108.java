package Company.LeetCode.lceasy;

/**
 * @Author Dale
 * @Date 2022/12/3 18:48
 * @Description
 */
public class Test1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String res = defangIPaddr(address);
        System.out.println(res);
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
