package com.acm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.acm.bean.Prize;
import com.acm.bean.Teacher;
import com.acm.bean.TeacherExample;
import com.acm.bean.TeacherPrize;
import com.acm.bean.TeacherPrizeExample;
import com.acm.bean.TeacherPrizeExample.Criteria;
import com.acm.dao.TeacherPrizeMapper;
import com.acm.service.TeacherPrizeService;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午2:06:59
* 类说明
*/
@Service
public class TeacherPrizeServiceImpl implements TeacherPrizeService{

	@Resource
	TeacherPrizeMapper teacherPrizeMapper;
	
	@Resource
	TeacherServiceImpl teacherServiceImpl;

	@Resource
	PrizeServiceImpl prizeServiceImpl;
	
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		TeacherPrizeExample example = new TeacherPrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andPrizenameIsNotNull();
		teacherPrizeMapper.deleteByExample(example);

	}
	@Override
	public long countByTeacherId(String id) {
		TeacherPrizeExample example = new TeacherPrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andTacheridEqualTo(id);
		return teacherPrizeMapper.countByExample(example);

	}
	@Override
	public TeacherPrize findByTeacherIdAndPrizeName(String id, String name) {
		// TODO Auto-generated method stub
		TeacherPrizeExample example = new TeacherPrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andPrizenameEqualTo(name).andTacheridEqualTo(id);
		List<TeacherPrize> teacherPrizes = teacherPrizeMapper.selectByExample(example);
		if(teacherPrizes.size()>0) {
			return teacherPrizes.get(0);
		}
		return null;
	}
	@Override
	public void addoOrDown(Prize prize, Teacher teacher,TeacherPrize teacherPrize) {
		// TODO Auto-generated method stub
		prizeServiceImpl.updatePrize(prize);
		teacherServiceImpl.updateTeacher(teacher);
		TeacherPrizeExample example = new TeacherPrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andTacheridEqualTo(teacher.getId()).andPrizenameEqualTo(prize.getName());
		teacherPrizeMapper.updateByExampleSelective(teacherPrize, example);
	}
	@Override
	public void insert(TeacherPrize teacherPrize) {
		// TODO Auto-generated method stub
		teacherPrizeMapper.insertSelective(teacherPrize);
		
	}
	@Override
	public List<TeacherPrize> findAll() {
		// TODO Auto-generated method stub
		TeacherPrizeExample example = new TeacherPrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andTacheridIsNotNull();
		return teacherPrizeMapper.selectByExample(example);
	}
	

}
