package com.acm.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.acm.bean.Message;
import com.acm.bean.Prize;
import com.acm.bean.Teacher;
import com.acm.service.impl.PrizeServiceImpl;
import com.acm.service.impl.TeacherPrizeServiceImpl;
import com.acm.service.impl.TeacherServiceImpl;
import com.sargeraswang.util.ExcelUtil.ExcelLogs;
import com.sargeraswang.util.ExcelUtil.ExcelUtil;

/**
 * @author 计算机网络软件应用1501 路素飞 QQ 2512977541
 * @version 创建时间：2017年11月17日 上午8:01:22 类说明
 */
@Controller
@RequestMapping("importExport")
public class ImportExportController {

	@Resource
	TeacherServiceImpl teacherServiceImpl;
	
	@Resource
	TeacherPrizeServiceImpl teacherPrizeServiceImpl;
	
	@Resource
	PrizeServiceImpl prizeServiceImpl;
	
	@ResponseBody
	@RequestMapping("/upUserExcel")
	public Message upUser(HttpServletRequest request, MultipartFile file)
			throws IllegalStateException, IOException {
       System.out.println(file);
		// 后缀判断
		System.out.println("fileName：" + file.getOriginalFilename());
		String fileName = file.getOriginalFilename();
		String index = fileName.substring(fileName.lastIndexOf("."));
		System.out.println("后缀：" + index);
		if (!index.equals(".xls")) {
			return Message.fail();
		}
		/*String path = request.getServletContext().getRealPath("/user/");
		 File file1 = new File(path);
		 if (!file1.exists()) {
		 file1.mkdirs();
		 }*/
		 //path = path + "/" + fileName;// 保存路径
		
		InputStream inputStream = file.getInputStream();

		ExcelLogs logs = new ExcelLogs();
		Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);
        List<Teacher> teachers = new ArrayList<>();
		for (Map m : importExcel) {
			//System.out.println(m);
			Teacher teacher = new Teacher();
			String id = (String) m.get("工号");
			String name = (String) m.get("姓名");
			int money = Integer.parseInt((String)m.get("金额"));
			teacher.setId(id);
			teacher.setName(name);
			teacher.setMoney(money);
			teachers.add(teacher);
		}
		teacherPrizeServiceImpl.deleteAll();
        teacherServiceImpl.insertTeacher(teachers);
		return Message.success();
	}
	
	@ResponseBody
	@RequestMapping("/upPrizeExcel")
	public Message upPrize(HttpServletRequest request, MultipartFile file)
			throws IllegalStateException, IOException {
       System.out.println(file);
		// 后缀判断
		System.out.println("fileName：" + file.getOriginalFilename());
		String fileName = file.getOriginalFilename();
		String index = fileName.substring(fileName.lastIndexOf("."));
		System.out.println("后缀：" + index);
		if (!index.equals(".xls")) {
			return Message.fail();
		}
		/*String path = request.getServletContext().getRealPath("/user/");
		 File file1 = new File(path);
		 if (!file1.exists()) {
		 file1.mkdirs();
		 }*/
		 //path = path + "/" + fileName;// 保存路径
		
		InputStream inputStream = file.getInputStream();

		ExcelLogs logs = new ExcelLogs();
		Collection<Map> importExcel = ExcelUtil.importExcel(Map.class, inputStream, "yyyy/MM/dd HH:mm:ss", logs, 0);
        List<Prize> prizes = new ArrayList<>();
		for (Map m : importExcel) {
			//System.out.println(m);
			Prize prize = new Prize();
			String name = (String) m.get("商品");
			int price = Integer.parseInt((String)m.get("价格"));
			int number = Integer.parseInt((String)m.get("数量"));
			prize.setName(name);
			prize.setPrice(price);
			prize.setNumber(number);
			prizes.add(prize);
			
		}
		prizeServiceImpl.insertPrize(prizes);
		return Message.success();
	}

	

}
