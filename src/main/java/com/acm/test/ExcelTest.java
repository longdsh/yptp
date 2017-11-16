package com.acm.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.acm.bean.Teacher;
import com.xuxueli.poi.excel.ExcelExportUtil;
import com.xuxueli.poi.excel.ExcelImportUtil;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 上午11:57:34
* 类说明
*/
public class ExcelTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String filePath = "C:\\Users\\Administrator\\Desktop\\yptp\\md.xls";
		List<Object> list = ExcelImportUtil.importExcel(Teacher.class, filePath);
		
		System.out.println(list);
		
		/*List<Teacher> teachers = new ArrayList<>();
		Teacher teacher = new Teacher("5646","阿达",10);
		teachers.add(teacher);
		ExcelExportUtil.exportToFile(teachers, filePath);*/
	}

}
