package cn.sunxyz.common.excel.core;

import java.io.OutputStream;
import java.util.List;
/**
 * excel 导入导出工具
 * @author
 * @date
 * @param <T>
 */
public interface IExcelUtil<T> {
	
  /**
	* 构建一个导入导出工具
	* @param clazz 一个类类型
	* @return  IExcelUtil<T> 返回类型
	*/
	IExcelUtil<T> build(Class<T> clazz);
	
  /**
	* 数据导出
	* @param sheetName
	* @param input
	* @return  List<T> 导出数据
	*/
	//List<T> importExcel(String sheetName, InputStream input);
	List<T> importExcel(String sheetName, String  input);

  /**
	* 导出到一个 sheet中
	* @param list
	* @param sheetName
	* @param output
	* @return  boolean
	*/
	boolean exportExcel(List<T> list, String sheetName, OutputStream output);
	
  /**
	* 导出到多个 sheet中
	* @param lists
	* @param sheetNames
	* @param output
	* @return  boolean
	*/
	boolean exportExcel(List<T> lists[], String sheetNames[], OutputStream output);

}
