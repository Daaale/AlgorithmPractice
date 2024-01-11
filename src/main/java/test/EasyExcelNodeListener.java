package test;

import Bean.ExcelNode;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class EasyExcelNodeListener extends AnalysisEventListener<ExcelNode> {
    private List<ExcelNode> excelNodes = new ArrayList<>();
    public List<ExcelNode> getExcelNodes() {
        return excelNodes;
    }
    @Override
    public void invoke(ExcelNode data, AnalysisContext analysisContext) {
        log.info("解析到一条数据："+data);
        excelNodes.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("所有数据都解析完成...");
    }
}
