package com.acm.test;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acm.bean.Teacher;
import com.acm.dao.TeacherMapper;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午1:59:00
* 类说明
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
public class DaoTest {
    
	@Resource
	TeacherMapper teacherMapper;
	@Test
	public void test() {
		//fail("Not yet implemented");
		Teacher teacher = new Teacher("0413654", "刘备", 500);
		teacherMapper.insert(teacher);
	}

}
