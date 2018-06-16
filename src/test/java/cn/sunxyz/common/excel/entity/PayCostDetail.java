package cn.sunxyz.common.excel.entity;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelID;
import lombok.Data;

import java.math.BigDecimal;


/**
 * @Author: HuangC
 * @Description:
 * @Date: 2018/6/14 16:47
 */
@Data
public class PayCostDetail {

    @ExcelID
    @ExcelAttribute(name="缴费明细ID",column="L")
    private Integer id;

    @ExcelAttribute(name="缴费内容",column="M")
    private String content;

    @ExcelAttribute(name="金额",column="N")
    private BigDecimal amount;
}
