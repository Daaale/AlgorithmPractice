package LeetCode.lceasy.test3000;

public class Test2744 {
    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        int res = maximumNumberOfStringPairs(words);
        System.out.println(res);
    }
    public static int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() != words[j].length()) continue;
                boolean flag = true;
                for (int k = 0; k < words[i].length(); k++) {
                    if (words[i].charAt(k) != words[j].charAt(words[i].length() - k - 1)) {
                        flag = false;
                    }
                }
                if (flag) res ++;
            }
        }
        return res;
    }
}
