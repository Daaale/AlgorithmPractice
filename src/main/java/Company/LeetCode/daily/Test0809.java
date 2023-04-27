package Company.LeetCode.daily;

import java.util.ArrayList;

/**
 * @author Dale
 * @create 2022-11-25 15:50
 * @description
 */
public class Test0809 {
    public static void main(String[] args) {
        String s = "heeellooo";
        String[] words = {"hello", "hi", "helo"};
        int res = expressiveWords(s, words);
        System.out.println(res);
    }
    public static int expressiveWords(String s, String[] words) {
        int res = 0;
        //计算s各位的数量
        ArrayList<Character> listChars = new ArrayList<>();
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int num = 1;
            listChars.add(c);
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    num ++;
                    if (j == s.length() - 1) {
                        i = j;
                    }
                } else {
                    i = j - 1;
                    break;
                }
            }
            listNum.add(num);
        }
        //判断 words 中的每一个是否可扩张
        for (int k = 0; k < words.length; k++) {
            String str = words[k];
            //计算str各位的数量
            ArrayList<Character> listCharsStr = new ArrayList<>();
            ArrayList<Integer> listNumStr = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int num = 1;
                listCharsStr.add(c);
                for (int j = i+1; j < str.length(); j++) {
                    if (str.charAt(j) == c) {
                        num ++;
                        if (j == str.length() - 1) {
                            i = j;
                        }
                    } else {
                        i = j - 1;
                        break;
                    }
                }
                listNumStr.add(num);
            }
            //比较四个list
            //先判断字符数量
            if (listChars.size() != listCharsStr.size()) break;
            //判断数量
            boolean flag = true;
            for (int i = 0; i < listChars.size(); i++) {
                //判断字符是否相同
                if (listChars.get(i) != listCharsStr.get(i)) {
                    flag = false;
                    break;
                }
                //判断数量
                if (listNum.get(i) > listNumStr.get(i) && listNum.get(i) == 2) {
                    flag = false;
                    break;
                }
                if (listNum.get(i) < listNumStr.get(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                res ++;
            }
        }
        return res;
    }
}
