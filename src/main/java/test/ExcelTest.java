package test;

import Bean.ExcelNode;
import com.alibaba.excel.EasyExcel;
import utils.TestFileUtil;

import java.io.File;
import java.io.InputStream;
import java.util.List;

public class ExcelTest {
    public static void main(String[] args) {
        String fileName = TestFileUtil.getPath() + "file" + File.separator + "花名册.xlsx";
        EasyExcelNodeListener easyExcelNodeListener = new EasyExcelNodeListener();
        // 读Excel
        EasyExcel.read(fileName, ExcelNode.class, easyExcelNodeListener).sheet().doRead();
        List<ExcelNode> excelNodes = easyExcelNodeListener.getExcelNodes();

        // 写Excel
        System.out.println("excel中的总行数为：" + excelNodes.size());
    }
}
