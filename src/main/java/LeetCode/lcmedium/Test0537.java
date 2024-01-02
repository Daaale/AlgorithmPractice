package LeetCode.lcmedium;

public class Test0537 {
    public static String complexNumberMultiply(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        String[] split1 = num1.split("\\+");
        String[] split2 = num2.split("\\+");
        int a1 = Integer.valueOf(split1[0]);
        int a2 = Integer.valueOf(split1[1].substring(0, split1[1].length() - 1));
        int b1 = Integer.valueOf(split2[0]);
        int b2 = Integer.valueOf(split2[1].substring(0, split2[1].length() - 1));
        int c1 = a1 * b1 - a2 * b2;
        int c2 = a2 * b1 + a1 * b2;
        res.append(c1);
        res.append('+');
        res.append(c2);
        res.append('i');
        return res.toString();
    }

    public static void main(String[] args) {
        String num1 = "1+1i";
        String num2 = "1+1i";
        String res = complexNumberMultiply(num1, num2);
        System.out.println(res);
    }
}
