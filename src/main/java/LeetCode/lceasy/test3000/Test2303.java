package LeetCode.lceasy.test3000;

public class Test2303 {
    public static void main(String[] args) {
//        int[][] brackets = {{3,50},{7,10},{12,25}};
        int[][] brackets = {{1,0},{4,25},{5,50}};
        int income = 2;
        double res = calculateTax(brackets, income);
        System.out.println(res);
    }
    public static double calculateTax(int[][] brackets, int income) {
        double tax_sum = 0;
        for (int i = 0; i < brackets.length; i++) {
            int last = i == 0 ? 0 : brackets[i - 1][0];
            if (income <= brackets[i][0] - last) {
                tax_sum += income * brackets[i][1] / 100.0;
                break;
            } else {
                tax_sum += (brackets[i][0] - last) * brackets[i][1] / 100.0;
                income -= (brackets[i][0] - last);
            }
        }
        return tax_sum;
    }
}
