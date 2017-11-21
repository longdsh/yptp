package com.acm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.acm.bean.Prize;
import com.acm.bean.PrizeExample;
import com.acm.bean.PrizeExample.Criteria;
import com.acm.dao.PrizeMapper;
import com.acm.service.PrizeService;

/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月16日 下午2:07:18
* 类说明
*/
@Service
public class PrizeServiceImpl implements PrizeService{

	@Resource
	PrizeMapper prizeMapper;
	
	@Resource
	SqlSession sqlSession;
	@Override
	public void insertPrize(List<Prize> prizes) {
		// TODO Auto-generated method stub
		deleteAll();
		PrizeMapper prizeMapper = (PrizeMapper) sqlSession
				.getMapper(PrizeMapper.class);
		
		for(int i=0;i<prizes.size();i++) {
			prizeMapper.insertSelective(prizes.get(i));
		}
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				PrizeExample example = new PrizeExample();
				Criteria criteria = example.createCriteria();
				criteria.andNameIsNotNull();
				prizeMapper.deleteByExample(example);
		
		
		
	}

	@Override
	public void updatePrize(Prize prize) {
		// TODO Auto-generated method stub
		PrizeExample example = new PrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(prize.getName());
		prizeMapper.updateByExampleSelective(prize, example);
		
	}

	@Override
	public List<Prize> selectAll() {
		// TODO Auto-generated method stub
		PrizeExample example = new PrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameIsNotNull();
		return prizeMapper.selectByExample(example);
	}

	@Override
	public Prize selectByName(String name) {
		// TODO Auto-generated method stub
		PrizeExample example = new PrizeExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(name);
		List<Prize> prizes = prizeMapper.selectByExample(example);
		if(prizes.size()>0) {
			return prizes.get(0);
		}
		return null;
	}

}
