package cn.bdqn.controller;

import cn.bdqn.bean.ResponseResult;
import cn.bdqn.domain.Admin;
import cn.bdqn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 管理员控制层
 * */

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/admin/login")
    @ResponseBody
    public ResponseResult login(String name,String password){
        Admin admin =adminService.queryById(name,password);
        ResponseResult result = new ResponseResult();
        if(admin!=null){
            return new ResponseResult(404,admin,"success");
        }else {
            return new ResponseResult(404,null,"error");
        }
    }

}
