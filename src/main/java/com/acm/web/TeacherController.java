package com.acm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acm.bean.Message;
import com.acm.bean.Teacher;
import com.acm.dao.TeacherMapper;
import com.acm.service.TeacherPrizeService;
import com.acm.service.impl.TeacherPrizeServiceImpl;
import com.acm.service.impl.TeacherServiceImpl;


/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午1:06:58
* 类说明
*/
@Controller
@RequestMapping("teacher")
public class TeacherController {
	
	@Resource
	TeacherServiceImpl teacherService;
	
	@Resource
	TeacherPrizeServiceImpl teacherPrizeServiceImpl;
	
	@ResponseBody
	@RequestMapping("/showAll")
	public Message showAll() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers = teacherService.selectAll();
		//判断是否选择奖品
		for(int i = 0;i<teachers.size();i++) {
			Teacher teacher = teachers.get(i);
			if(teacherPrizeServiceImpl.countByTeacherId(teacher.getId())>0) {
				teacher.getCon().put("isBuy", 1);
			}else {
				teacher.getCon().put("isBuy", 0);
			}
		}
		return Message.success().add("teachers", teachers);
	}
	
	@ResponseBody
	@RequestMapping("findTeacher")
	public Message findTeacher(Teacher teacher,HttpServletRequest request) {
		System.out.println(teacher);
		Teacher teacher2 = teacherService.selectTeacherById(teacher.getId());
		System.out.println(teacher2);
		if(teacher2==null) {
			return Message.fail();
		}else {
			String name = teacher.getName();
			String name1 = teacher2.getName();
			System.out.println(name.equals(name1));
			if(!name.equals(name1)) {
				return Message.fail();
			}
		}
		request.getSession().setAttribute("teacher", teacher2);
		
		//System.out.println("teacher:"+request.getSession().getAttribute("teacher"));
		return Message.success();
	}
  
}
