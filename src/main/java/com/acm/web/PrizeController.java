package com.acm.web;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.acm.bean.Message;
import com.acm.bean.Prize;
import com.acm.bean.Teacher;
import com.acm.bean.TeacherPrize;
import com.acm.service.impl.PrizeServiceImpl;
import com.acm.service.impl.TeacherPrizeServiceImpl;
import com.acm.service.impl.TeacherServiceImpl;

/**
 * @author 计算机网络软件应用1501 路素飞 QQ 2512977541
 * @version 创建时间：2017年11月17日 上午10:44:29 类说明
 */
@Controller
@RequestMapping("/prize")
public class PrizeController {

	@Resource
	TeacherServiceImpl teacherServiceImpl;

	@Resource
	TeacherPrizeServiceImpl teacherPrizeServiceImpl;

	@Resource
	PrizeServiceImpl prizeServiceImpl;
	Teacher teacher = null;

	@ResponseBody
	@RequestMapping("showAll")
	public Message showAll(HttpServletRequest request) {
		// System.out.println("teacher
		// Prize:"+request.getSession().getAttribute("teacher"));
		teacher = (Teacher) request.getSession().getAttribute("teacher");

		// 需准备数据
		// 1.商品名 2.价格 3.剩余 4.已购买数量 5.剩余金额
		List<Prize> prizes = prizeServiceImpl.selectAll();
		System.out.println("PrizeController showAll:" + prizes);
		int money = teacher.getMoney();
		for (int i = 0; i < prizes.size(); i++) {
			// 查询订单情况
			Prize prize = prizes.get(i);
			TeacherPrize teacherPrize = teacherPrizeServiceImpl.findByTeacherIdAndPrizeName(teacher.getId(),
					prize.getName());
			if(teacherPrize!=null) {
				prize.getCon().put("buyNum", teacherPrize.getNumber());
			}else {
				prize.getCon().put("buyNum", 0);
			}
		}
		return Message.success().add("prizes", prizes).add("money", money);

	}
	
	public Message add(String name) {
		return null;
		
	}
}
