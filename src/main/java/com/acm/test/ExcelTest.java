package com.acm.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.acm.bean.Teacher;
import com.acm.bean.TeacherPrize;
import com.sargeraswang.util.ExcelUtil.ExcelLogs;
import com.sargeraswang.util.ExcelUtil.ExcelUtil;


/**
 * @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
 * @version 创建时间：2017年11月16日 上午11:57:34 类说明
 */
public class ExcelTest {

	@Test
	public void testImport() throws FileNotFoundException {

		String filePath = "C:\\Users\\Administrator\\Desktop\\yptp\\名单.xls";

		
		File f = new File(filePath);
		InputStream inputStream = new FileInputStream(f);

		ExcelLogs logs = new ExcelLogs();
		Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);

		for (Map m : importExcel) {
			System.out.println(m);
			System.out.println(m.get("工号"));
		}
	}
	
	 @Test
	    public void exportXls() throws IOException {
	        //用排序的Map且Map的键应与ExcelCell注解的index对应
		 String filePath = "C:\\Users\\Administrator\\Desktop\\yptp\\教师奖品.xls";
	        Map<String,String> map = new LinkedHashMap<>();
	        map.put("0","工号");
	        map.put("1","姓名");
	        map.put("2","所选奖品");
	        map.put("3","数量");
	        Collection<Object> dataset=new ArrayList<Object>();
	        dataset.add(new TeacherPrize("12345", "阿斯蒂芬", "酒",5));
	        dataset.add(new TeacherPrize("12345", "阿斯蒂芬", "酒",5));
	        dataset.add(new TeacherPrize("12345", "阿斯蒂芬", "酒",5));
	        File f=new File(filePath);
	        OutputStream out =new FileOutputStream(f);
	        
	        ExcelUtil.exportExcel(map, dataset, out);
	        out.close();
	    }

}
