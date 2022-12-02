package com.evan.wj.mapper;

import com.evan.wj.model.Testnum;
import com.evan.wj.model.TestnumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestnumMapper {
    int countByExample(TestnumExample example);

    int deleteByExample(TestnumExample example);

    int insert(Testnum record);

    int insertSelective(Testnum record);

    List<Testnum> selectByExample(TestnumExample example);

    int updateByExampleSelective(@Param("record") Testnum record, @Param("example") TestnumExample example);

    int updateByExample(@Param("record") Testnum record, @Param("example") TestnumExample example);
}