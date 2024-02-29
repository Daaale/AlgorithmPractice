package LeetCode.lcmedium.test1000;

import java.util.HashMap;
import java.util.Map;

public class Test0535 {
    private static Map<Integer, String> dataBase = new HashMap<Integer, String>();
    private static int id;

    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = encode(url);
        System.out.println(shortUrl);
        String longUrl = decode(shortUrl);
        System.out.println(longUrl);
    }
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
        id++;
        dataBase.put(id, longUrl);
        return "http://tinyurl.com/" + id;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
        int p = shortUrl.lastIndexOf('/') + 1;
        int key = Integer.parseInt(shortUrl.substring(p));
        return dataBase.get(key);
    }
}
