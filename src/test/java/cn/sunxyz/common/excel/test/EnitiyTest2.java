package cn.sunxyz.common.excel.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.*;

import cn.sunxyz.common.excel.entity.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

import cn.sunxyz.common.excel.config.ElementTypePath;
import cn.sunxyz.common.excel.core.ExcelUtils;
import cn.sunxyz.common.excel.core.IExcelUtil;

public class EnitiyTest2 {
	
	private Logger logger = LoggerFactory.getLogger(EnitiyTest2.class); 
	
	@Test
	public void exportExcel(){
		

		Set<Student> students = new HashSet<>();
		Student student = new Student();
		student.setId("121");
		student.setAge(8);
		student.setName("小明");
		students.add(student);
		
		Map<String,String> sMap = new HashMap<>();
		sMap.put("性别", "男");
		sMap.put("地址", "济南");
		Student student2 = new Student();
		student2.setId("122");
		student2.setAge(9);
		student2.setName("小李");
		student2.setMap(sMap);
		students.add(student2);
		
		
		Set<Clazz> clazzs = new HashSet<>();
		
		Clazz clazz = new Clazz();
		clazz.setId("11");
		clazz.setName("一年级");
		clazz.setStudents(students);
		clazzs.add(clazz);
		
		Clazz clazz2 = new Clazz();
		clazz2.setId("12");
		clazz2.setName("二年级");
		clazz2.setStudents(students);
		clazzs.add(clazz2);
		
		Clazz clazz3 = new Clazz();
		clazz3.setId("13");
		clazz3.setName("三年级");
		clazzs.add(clazz3);
		
		Clazz clazz4 = new Clazz();
		clazz4.setId("14");
		clazz4.setName("四年级");
		clazz4.setStudents(students);
		clazzs.add(clazz4);
		
		List<School> list = new ArrayList<>();
		
		School school = new School();
		school.setId("1");
		school.setName("中山");
		school.setClazzs(clazzs);
		list.add(school);
		
		Map<String,String> map = new HashMap<>();
		map.put("1", "红星小学");
		map.put("2", "TOP");
		School school1 = new School();
		school1.setId("2");
		school1.setName("红星");
		school1.setClazzs(clazzs);
		school1.setMap(map);
		list.add(school1);


        List<PayCostDetail> payCostDetailList = new ArrayList<>();
        PayCostDetail payCostDetail = new PayCostDetail();
        payCostDetail.setId(1);
        payCostDetail.setContent("書本費");
        payCostDetail.setAmount(new BigDecimal("200"));

        PayCostDetail payCostDetail1 = new PayCostDetail();
        payCostDetail1.setId(2);
        payCostDetail1.setContent("生活費");
        payCostDetail1.setAmount(new BigDecimal("200"));

        payCostDetailList.add(payCostDetail);
        payCostDetailList.add(payCostDetail1);


        List<PayCostItem> payCostItemList = new ArrayList<>();
        PayCostItem payCostItem = new PayCostItem();
        payCostItem.setId(1);
        payCostItem.setName("學費1");
        payCostItem.setPayCostDetails(payCostDetailList);

        PayCostItem payCostItem1 = new PayCostItem();
        payCostItem1.setId(2);
        payCostItem1.setName("學費2");
        payCostItem1.setPayCostDetails(payCostDetailList);

        payCostItemList.add(payCostItem);
        payCostItemList.add(payCostItem1);

        List<PayCost> payCostList = new ArrayList<>();
        PayCost payCost = new PayCost();
        payCost.setId(1);
        payCost.setType("教育");
        payCost.setAmount(new BigDecimal("800"));
        payCost.setName("2018年學費");
        payCost.setEndTime("2018-06-10");
        payCost.setStudentCode("007");
        payCost.setStudentName("陈小伟");
        payCost.setSchoolName("香港朝阳小学");
        payCost.setStatus(1);
        payCost.setPayCostItems(payCostItemList);

		PayCost payCost1 = new PayCost();
		payCost1.setId(2);
		payCost1.setType("教育");
		payCost1.setAmount(new BigDecimal("800"));
		payCost1.setName("2018年學費");
		payCost1.setEndTime("2018-06-10");
		payCost1.setStudentCode("007");
		payCost1.setStudentName("陈小伟");
		payCost1.setSchoolName("香港朝阳小学");
		payCost1.setStatus(1);
		payCost1.setPayCostItems(payCostItemList);

        payCostList.add(payCost);
        payCostList.add(payCost1);

        FileOutputStream output = null;  
        /*try {
        	output = new FileOutputStream("e:\\success4.xls");
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
		IExcelUtil<School> eu = new ExcelUtils<>();
		eu.build(School.class).exportExcel(list, "学校信息", output);*/



		try {
			output = new FileOutputStream("e:\\success5.xls");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		IExcelUtil<PayCost> eu = new ExcelUtils<>();
		eu.build(PayCost.class).exportExcel(payCostList, "学校信息", output);
	}
	
	
	@Test
	public void importExcel(){
		//FileInputStream fis = null;
        //try {
            //fis = new FileInputStream("e:\\success4.xls");
		/*IExcelUtil<School> util = new ExcelUtils<>();//创建excel工具类
		List<School> list = util.build(School.class).importExcel("学校信息", "e:\\success4.xls");// 导入
		list.forEach(data->{
			System.out.println("学校：---->"+JSON.toJSONString(data));
			data.getClazzs().forEach(data1->{
				System.out.println("班级：---->"+JSON.toJSONString(data1));
				data1.getStudents().forEach(data2->{
					System.out.println("学生：---->"+JSON.toJSONString(data2));
				});
			});
		});*/

			//fis = new FileInputStream("e:\\success5.xls");
			IExcelUtil<PayCost> util = new ExcelUtils<>();//创建excel工具类
            List<PayCost> list = util.build(PayCost.class).importExcel("学校信息", "e:\\success5.xls");// 导入

			list.forEach(data->{
				System.out.println("缴费单：---->"+data);
				data.getPayCostItems().forEach(data1->{
					System.out.println("缴费项：---->"+data1);
					data1.getPayCostDetails().forEach(data2->{
						System.out.println("明细：----->"+data2);
					});
				});
			});

            logger.info(JSON.toJSONString(list));
        //} catch (FileNotFoundException e) {
         //   e.printStackTrace();
       // }
	}
	@Test
	public void test(){
		logger.debug(ElementTypePath.MAP+"");
	}

}
