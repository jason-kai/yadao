package cn.yadao.springcloud.web.controller;

import cn.yadao.springcloud.domain.Employee;
import cn.yadao.springcloud.util.AjaxResult;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C), 2018-2028, Chong Qing yadao.cn
 * FileName: EmployeeController.java
 *
 * @author jasonkai
 * @version 1.00
 * @introduce：
 *      员工登录接口
 * @Date 2019/1/27
 */
@RestController
public class EmployeeController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Map<String,String> map){

        String username = map.get("username");
        String password = map.get("password");

        if (StringUtils.isEmpty(username)||StringUtils.isEmpty(password)) {
            return AjaxResult.me().setMessage("请填写用户名或密码！").setSuccess(false);
        }

        if ("admin".equals(username)&&"1".equals(password)){
            Map<String, Employee> map1 = new HashMap<>();
            map1.put("admin1", new Employee(true,"章邯"));
            return AjaxResult.me().setReturnObj(map1).setMessage("登录成功").setSuccess(true);
        }

        return AjaxResult.me().setMessage("密码或用户名错误").setSuccess(false);
    }

}
