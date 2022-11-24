package Company.Yunzhi;

/**
 * @Author Dale
 * @Date 2022/11/22 21:14
 * @Description
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("reset", "reset what");
        hMap.put("reset board", "board fault");
        hMap.put("board add", "where to add");
        hMap.put("board delet", "no board at all");
        hMap.put("reboot backplane", "impossible");
        hMap.put("backplane abort", "install first");
        while (in.hasNext()) {
            String[] strs = in.nextLine().split(" ");
            int count = 0; // 记录匹配个数
            Set<String> set = hMap.keySet();
            String key = "";
            for(String s : set){
                String[] temps = s.split(" ");
                if(temps.length == strs.length){//命令单词个数等于输入的字串个数
                    int i = 0;
                    while(i < temps.length){
                        if(temps[i].contains(strs[i]))
                            i++;
                        else
                            break;
                    }
                    if(i == temps.length){ // 找到匹配
                        key = s;
                        count++;
                    }
                }
            }
            if(count != 1)//只能匹配一个，若匹配到了多个，不能确定是哪个
                System.out.println("unkown command");
            else
                System.out.println(hMap.get(key));

        }
        in.close();
    }
}

