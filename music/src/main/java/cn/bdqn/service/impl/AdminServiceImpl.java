package cn.bdqn.service.impl;

import cn.bdqn.domain.Admin;
import cn.bdqn.mapper.AdminMapper;
import cn.bdqn.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.support.incrementer.AbstractDataFieldMaxValueIncrementer;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin queryById(String name, String password) {
        return adminMapper.selectById(name,password);
    }
}
