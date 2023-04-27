package Company.LeetCode.lceasy;

import java.util.Arrays;

/**
 * @author Dale
 * @create 2022-11-27 13:10
 * @description
 */
public class Test2469 {
    public static void main(String[] args) {
        double celsius = 36.50;
        double[] res = convertTemperature(celsius);
        System.out.println(Arrays.toString(res));
    }
    public static double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        res[0] = celsius + 273.15;
        res[1] = celsius * 1.8 + 32.00;
        return res;
    }
}
