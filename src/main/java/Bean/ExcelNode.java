package Bean;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelNode {
    @ExcelProperty("工号")
    private String id;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("部门")
    private String department;
    @ExcelProperty("岗位")
    private String position;
}
