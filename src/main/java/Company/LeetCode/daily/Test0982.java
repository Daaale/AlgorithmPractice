package Company.LeetCode.daily;

/**
 * @author Dale
 * @create 2023-03-04 15:02
 * @description
 */
public class Test0982 {
    public static void main(String[] args) {
        int[] nums = {2,1,3};
        int res = countTriplets(nums);
        System.out.println(res);
    }
    public static int countTriplets(int[] nums) {
        int[] cnt = new int[1 << 16];
        for (int x : nums)
            for (int y : nums)
                ++cnt[x & y];
        int ans = 0;
        for (int x : nums)
            for (int y = 0; y < 1 << 16; ++y)
                if ((x & y) == 0)
                    ans += cnt[y];
        return ans;
    }
}
