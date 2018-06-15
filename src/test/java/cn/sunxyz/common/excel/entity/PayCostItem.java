package cn.sunxyz.common.excel.entity;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @Author: HuangC
 * @Description:
 * @Date: 2018/6/14 16:45
 */
@Data
public class PayCostItem {

    @ExcelID
    @ExcelAttribute(name="缴费项编号",column="J")
    private Integer id;

    @ExcelAttribute(name="缴费项",column="K")
    private String name;

    @ExcelElement
    private List<PayCostDetail> payCostDetails;
}
