package com.qianfeng.controller;

import com.qianfeng.pojo.CrmStaff;
import com.qianfeng.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WyenZhao
 * @create 2018-02-26 17:13
 **/
@Controller
@RequestMapping(value = "/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/login")
    public String checkLogin(String loginName, String loginPwd) {
        CrmStaff staff = staffService.getStaff(loginName, loginPwd);
        if (staff != null) {
            return "frame";
        }
        return "login";
    }
}
