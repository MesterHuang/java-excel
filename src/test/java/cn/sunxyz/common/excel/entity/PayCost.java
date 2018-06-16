package cn.sunxyz.common.excel.entity;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: HuangC
 * @Description:
 * @Date: 2018/6/14 16:41
 */
@Data
public class PayCost {

    @ExcelID
    @ExcelAttribute(name="缴费单号",column="A")
    private Integer id;

    @ExcelAttribute(name="缴费类型",column="B")
    private String type;

    @ExcelAttribute(name="缴费名称",column="C")
    private String name;

    @ExcelAttribute(name="缴费金额",column="D")
    private BigDecimal amount;

    @ExcelAttribute(name="到期时间",column="E")
    private String endTime;

    @ExcelAttribute(name="学号",column="F")
    private String studentCode;

    @ExcelAttribute(name="学生姓名",column="G")
    private String studentName;

    @ExcelAttribute(name="学校名称",column="H")
    private String schoolName;

    @ExcelAttribute(name="状态",column="I")
    private Integer status;

    @ExcelElement
    private List<PayCostItem> payCostItems;
}
