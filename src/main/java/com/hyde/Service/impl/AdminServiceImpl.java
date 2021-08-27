package com.hyde.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hyde.Service.AdminService;
import com.hyde.entity.Admin;
import com.hyde.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> queryByUserPwd(String user,String pwd) {
        QueryWrapper<Admin> adminQueryWrapper = new QueryWrapper<>();
        adminQueryWrapper.eq("user_login", user).eq("pwd_login", pwd);
        return adminMapper.selectList(adminQueryWrapper);
    }
}
