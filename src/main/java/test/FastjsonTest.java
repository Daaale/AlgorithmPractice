package test;

import Bean.ExcelNode;
import Bean.TreeNode;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;

public class FastjsonTest {
    public static void main(String[] args) {
        // 将Java对象序列化为JSON
        ExcelNode node = new ExcelNode("1001", "TOM", "信息部", "员工");
        String jsonString = JSON.toJSONString(node);
        System.out.println(jsonString);

        // 将JSON解析为JSONObject
        ExcelNode parseObject = JSON.parseObject(jsonString, ExcelNode.class);
        System.out.println(parseObject);


    }
}
