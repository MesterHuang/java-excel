package cn.sunxyz.common.excel.entity;

import java.util.Date;

import cn.sunxyz.common.excel.annotation.ExcelAttribute;
import cn.sunxyz.common.excel.annotation.ExcelID;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;

@Data
public class Student {
	
	/*@ExcelID
	@ExcelAttribute(name="学生编号",column="F")
	private String id;
	
	@ExcelAttribute(name="学生姓名",column="G")
	private String name;
	
	@ExcelAttribute(name="学生年龄",column="H")
	private Integer age;
	
	@ExcelElement
	@ExcelAttribute(name="学生详细信息",column="I")
	private Map<String,String> map;*/

	/**
	 * ID
	 */
	@ExcelID
	@ExcelAttribute(name="序号",column="A")
	@Column
	private Integer id;

	/**
	 * 學生名稱
	 */
	@ExcelAttribute(name="学生编号",column="B")
	@Column
	private String name;

	/**
	 *學號
	 */
	@ExcelAttribute(name="學號",column="C")
	@Column(name = "school_number")
	private String schoolNumber ;

	/**
	 *身份證
	 */
	@ExcelAttribute(name="身份證",column="D")
	@Column(name = "id_card")
	private String idCard ;

	/**
	 *監護人電話
	 */
	@ExcelAttribute(name="監護人電話",column="E")
	@Column(name = "guardian_mobile")
	private String guardianMobile ;

	/**
	 *學校id
	 */
	@Column(name = "school_id")
	private Integer schoolId;

	/**
	 *學年（屆）id
	 */
	@ExcelAttribute(name="學年（屆）",column="F")
	@Column(name = "period_id")
	private Integer periodId;

	/**
	 *年級id
	 */
	@ExcelAttribute(name="年級",column="G")
	@Column(name = "grade_id")
	private Integer gradeId;

	/**
	 *班級id
	 */
	@ExcelAttribute(name="班級",column="H")
	@Column(name = "classNo_id")
	private Integer classNoId;

	/**
	 *狀態：0=關閉 1=啟用
	 */
	@Column
	private Boolean status;

	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
	@CreationTimestamp
	private Date createTime;

}
