package LeetCode.lcmedium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Test0811 {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> res = subdomainVisits(cpdomains);
        System.out.println(res.get(0));
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cpdomains.length; i++) {
            String[] split = cpdomains[i].split(" ");
            // 计算每个子域名的访问次数，并加入map
            int cnt = Integer.valueOf(split[0]);
            String[] address = split[1].split("\\.");
            String temp = new String();
            for (int j = address.length - 1; j >= 0; j--) {
                if (j == address.length - 1) {
                    if (map.containsKey(address[j])) {
                        map.put(address[j], map.get(address[j]) + cnt);
                    } else {
                        map.put(address[j], cnt);
                    }
                    temp = address[j];
                } else {
                    temp = address[j] + "." + temp;
                    if (map.containsKey(temp)) {
                        map.put(temp, map.get(temp) + cnt);
                    } else {
                        map.put(temp, cnt);
                    }
                }
            }
        }
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            res.add(map.get(next) + " " + next);
        }
        return res;
    }
}
