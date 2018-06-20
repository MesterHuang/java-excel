package cn.sunxyz.common.excel.entity;

import java.util.HashSet;
import java.util.Set;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelElement;
import cn.sunxyz.common.excel.annotation.ExcelID;
import lombok.Data;


@Data
public class Clazz{
   
	@ExcelID
	@ExcelAttribute(name="教室编号",column="D")
	private String id;
	
	@ExcelAttribute(name="教室名称",column="E")
	private String name;
	
	@ExcelElement
	private Set<Student> students = new HashSet<>();

}
