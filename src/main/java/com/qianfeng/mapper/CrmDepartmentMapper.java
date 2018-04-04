package com.qianfeng.mapper;

import com.qianfeng.pojo.CrmDepartment;
import com.qianfeng.pojo.CrmDepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmDepartmentMapper {
    int countByExample(CrmDepartmentExample example);

    int deleteByExample(CrmDepartmentExample example);

    int deleteByPrimaryKey(String depid);

    int insert(CrmDepartment record);

    int insertSelective(CrmDepartment record);

    List<CrmDepartment> selectByExample(CrmDepartmentExample example);

    CrmDepartment selectByPrimaryKey(String depid);

    int updateByExampleSelective(@Param("record") CrmDepartment record, @Param("example") CrmDepartmentExample example);

    int updateByExample(@Param("record") CrmDepartment record, @Param("example") CrmDepartmentExample example);

    int updateByPrimaryKeySelective(CrmDepartment record);

    int updateByPrimaryKey(CrmDepartment record);
}