package cn.sunxyz.common.excel.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 用于确定数据的唯一性
 * @author
 * @date
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelID {

	/**
	 * 默认属性
	 * @return  String 返回类型
	 * @throws
	 */
	String value() default "";
}
