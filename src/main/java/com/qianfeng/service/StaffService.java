package com.qianfeng.service;

import com.qianfeng.pojo.CrmStaff;

/**
 * @author WyenZhao
 * @create 2018-02-26 17:15
 **/
public interface StaffService {

    /**
     * 根据登录姓名及登录密码查找用户
     * @param loginName
     * @param loginPwd
     * @return
     */
    CrmStaff getStaff(String loginName, String loginPwd);
}
