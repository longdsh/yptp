package com.acm.test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acm.bean.Teacher;
import com.acm.service.impl.TeacherServiceImpl;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午1:59:21
* 类说明
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
public class ServiceTest {
    @Resource
	TeacherServiceImpl teacherServiceImpl;
	@Test
	public void testTeacherSelect() {
		//fail("Not yet implemented");
		//Teacher teacher = teacherServiceImpl.selectTeacherById("0413654");
		List<Teacher> teachers = teacherServiceImpl.selectAll();
		System.out.println(teachers);
	}
	@Test
	public void testTeacherInsert() {
		//fail("Not yet implemented");
		List<Teacher> teachers= new ArrayList<>();
		for(int i=0;i<10;i++) {
			Teacher teacher = new Teacher("1"+i, "asd", 100);
			teachers.add(teacher);
			
		}
		teacherServiceImpl.insertTeacher(teachers);
		
		//System.out.println(teacher);
	}

}
