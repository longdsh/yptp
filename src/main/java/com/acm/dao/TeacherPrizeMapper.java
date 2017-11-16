package com.acm.dao;

import com.acm.bean.TeacherPrize;
import com.acm.bean.TeacherPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherPrizeMapper {
    long countByExample(TeacherPrizeExample example);

    int deleteByExample(TeacherPrizeExample example);

    int insert(TeacherPrize record);

    int insertSelective(TeacherPrize record);

    List<TeacherPrize> selectByExample(TeacherPrizeExample example);

    int updateByExampleSelective(@Param("record") TeacherPrize record, @Param("example") TeacherPrizeExample example);

    int updateByExample(@Param("record") TeacherPrize record, @Param("example") TeacherPrizeExample example);
}