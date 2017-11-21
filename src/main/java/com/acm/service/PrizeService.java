package com.acm.service;

import java.util.List;

import com.acm.bean.Prize;

/**
 * @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
 * @version 创建时间：2017年11月16日 下午2:06:11 类说明
 */
public interface PrizeService {

	public void insertPrize(List<Prize> prizes);

	public void deleteAll();

	public void updatePrize(Prize prize);

	public List<Prize> selectAll();

	public Prize selectByName(String name);

}
