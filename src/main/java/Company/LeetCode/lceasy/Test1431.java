package Company.LeetCode.lceasy;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dale
 * @create 2023-04-03 11:09
 * @description
 */
public class Test1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> res = kidsWithCandies(candies, extraCandies);
        System.out.println(res);
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = -1;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] < max) {
                list.add(false);
            } else {
                list.add(true);
            }
        }
        return list;
    }
}
