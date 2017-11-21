package com.acm.dao;

import com.acm.bean.Prize;
import com.acm.bean.PrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizeMapper {
    long countByExample(PrizeExample example);

    int deleteByExample(PrizeExample example);

    int insert(Prize record);

    int insertSelective(Prize record);

    List<Prize> selectByExample(PrizeExample example);

    int updateByExampleSelective(@Param("record") Prize record, @Param("example") PrizeExample example);

    int updateByExample(@Param("record") Prize record, @Param("example") PrizeExample example);
}