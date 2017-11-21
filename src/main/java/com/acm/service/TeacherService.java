package com.acm.service;

import java.util.List;

import com.acm.bean.Teacher;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午1:06:11
* 类说明
*/
public interface TeacherService {
	public void insertTeacher(Teacher teacher);
	public void insertTeacher(List<Teacher> teachers);
	public Teacher selectTeacherById(String id);
	public Teacher selectTeacherByName(String name);
	public List<Teacher> selectAll();
	public void updateTeacher(Teacher teacher);
	public void deleteAll();

}
