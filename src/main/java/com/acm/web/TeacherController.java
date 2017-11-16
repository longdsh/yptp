package com.acm.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acm.bean.Message;
import com.acm.bean.Teacher;
import com.acm.dao.TeacherMapper;
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
	
	@ResponseBody
	@RequestMapping("/showAll")
	public Message showAll() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers = teacherService.selectAll();
		return Message.success().add("teachers", teachers);
	}
  
}
