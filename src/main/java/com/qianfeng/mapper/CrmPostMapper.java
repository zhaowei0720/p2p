package com.qianfeng.mapper;

import com.qianfeng.pojo.CrmPost;
import com.qianfeng.pojo.CrmPostExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmPostMapper {
    int countByExample(CrmPostExample example);

    int deleteByExample(CrmPostExample example);

    int deleteByPrimaryKey(String postid);

    int insert(CrmPost record);

    int insertSelective(CrmPost record);

    List<CrmPost> selectByExample(CrmPostExample example);

    CrmPost selectByPrimaryKey(String postid);

    int updateByExampleSelective(@Param("record") CrmPost record, @Param("example") CrmPostExample example);

    int updateByExample(@Param("record") CrmPost record, @Param("example") CrmPostExample example);

    int updateByPrimaryKeySelective(CrmPost record);

    int updateByPrimaryKey(CrmPost record);
}