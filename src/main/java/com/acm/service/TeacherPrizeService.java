package com.acm.service;

import java.util.List;

import com.acm.bean.Prize;
import com.acm.bean.Teacher;
import com.acm.bean.TeacherPrize;

/**
 * @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
 * @version 创建时间：2017年11月16日 下午2:06:44 类说明
 */
public interface TeacherPrizeService {
	public void insert(TeacherPrize teacherPrize);
	public void deleteAll();
	public long countByTeacherId(String id);
	public TeacherPrize findByTeacherIdAndPrizeName(String id,String name);
	public void addoOrDown(Prize prize,Teacher teacher,TeacherPrize teacherPrize);
	public List<TeacherPrize> findAll();

}
