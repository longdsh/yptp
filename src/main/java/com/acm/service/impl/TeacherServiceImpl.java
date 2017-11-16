package com.acm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.acm.bean.Teacher;
import com.acm.bean.TeacherExample;
import com.acm.bean.TeacherExample.Criteria;
import com.acm.dao.TeacherMapper;
import com.acm.service.TeacherService;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午1:06:29
* 类说明
*/
@Service
public class TeacherServiceImpl implements TeacherService{

	@Resource
	TeacherMapper teacherMapper;
	@Override
	public void insertTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertTeacher(List<Teacher> teachers) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<teachers.size();i++) {
			teacherMapper.insertSelective(teachers.get(i));
		}
		
	}

	@Override
	public Teacher selectTeacherById(String id) {
		TeacherExample example = new TeacherExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Teacher> teachers = teacherMapper.selectByExample(example);
		if(teachers.size()<=0) {
			return null;
		}
		return teachers.get(0);
		
		
	}

	@Override
	public Teacher selectTeacherByName(String name) {
		TeacherExample example = new TeacherExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		
		List<Teacher> teachers = teacherMapper.selectByExample(example);
		if(teachers.size()<=0) {
			return null;
		}
		return teachers.get(0);
		
	}

}
