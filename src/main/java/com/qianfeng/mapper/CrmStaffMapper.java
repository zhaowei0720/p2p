package com.qianfeng.mapper;

import com.qianfeng.pojo.CrmStaff;
import com.qianfeng.pojo.CrmStaffExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmStaffMapper {
    int countByExample(CrmStaffExample example);

    int deleteByExample(CrmStaffExample example);

    int deleteByPrimaryKey(String staffid);

    int insert(CrmStaff record);

    int insertSelective(CrmStaff record);

    List<CrmStaff> selectByExample(CrmStaffExample example);

    CrmStaff selectByPrimaryKey(String staffid);

    int updateByExampleSelective(@Param("record") CrmStaff record, @Param("example") CrmStaffExample example);

    int updateByExample(@Param("record") CrmStaff record, @Param("example") CrmStaffExample example);

    int updateByPrimaryKeySelective(CrmStaff record);

    int updateByPrimaryKey(CrmStaff record);
}