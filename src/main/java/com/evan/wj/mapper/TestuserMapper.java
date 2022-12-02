package com.evan.wj.mapper;

import com.evan.wj.model.Testuser;
import com.evan.wj.model.TestuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestuserMapper {
    int countByExample(TestuserExample example);

    int deleteByExample(TestuserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Testuser record);

    int insertSelective(Testuser record);

    List<Testuser> selectByExample(TestuserExample example);

    Testuser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Testuser record, @Param("example") TestuserExample example);

    int updateByExample(@Param("record") Testuser record, @Param("example") TestuserExample example);

    int updateByPrimaryKeySelective(Testuser record);

    int updateByPrimaryKey(Testuser record);
}