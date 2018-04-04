package com.qianfeng.service.Impl;

import com.qianfeng.mapper.CrmStaffMapper;
import com.qianfeng.pojo.CrmStaff;
import com.qianfeng.pojo.CrmStaffExample;
import com.qianfeng.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

/**
 * @author WyenZhao
 * @create 2018-02-26 17:19
 **/
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private CrmStaffMapper crmStaffMapper;

    @Override
    public CrmStaff getStaff(String loginName, String loginPwd) {
        CrmStaffExample example = new CrmStaffExample();
        CrmStaffExample.Criteria criteria = example.createCriteria();
        criteria.andLoginnameEqualTo(loginName);
        List<CrmStaff> crmStaffs = crmStaffMapper.selectByExample(example);
        if (crmStaffs != null && crmStaffs.size() > 0) {
            CrmStaff crmStaff=crmStaffs.get(0);
            if (crmStaff.getLoginpwd().equalsIgnoreCase(DigestUtils.md5DigestAsHex(loginPwd.getBytes()))){
                return crmStaff;
            }
        }
        return null;
    }
}
