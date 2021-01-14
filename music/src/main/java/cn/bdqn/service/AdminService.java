package cn.bdqn.service;

import cn.bdqn.domain.Admin;

/*
* 用户service层
* */
public interface AdminService {

    public Admin queryById(String name, String password);
}
