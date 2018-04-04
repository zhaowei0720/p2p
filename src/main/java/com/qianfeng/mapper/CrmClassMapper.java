package com.qianfeng.mapper;

import com.qianfeng.pojo.CrmClass;
import com.qianfeng.pojo.CrmClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmClassMapper {
    int countByExample(CrmClassExample example);

    int deleteByExample(CrmClassExample example);

    int deleteByPrimaryKey(String classid);

    int insert(CrmClass record);

    int insertSelective(CrmClass record);

    List<CrmClass> selectByExample(CrmClassExample example);

    CrmClass selectByPrimaryKey(String classid);

    int updateByExampleSelective(@Param("record") CrmClass record, @Param("example") CrmClassExample example);

    int updateByExample(@Param("record") CrmClass record, @Param("example") CrmClassExample example);

    int updateByPrimaryKeySelective(CrmClass record);

    int updateByPrimaryKey(CrmClass record);
}