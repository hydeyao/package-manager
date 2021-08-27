package com.hyde;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hyde.Service.AdminService;
import com.hyde.entity.Admin;
import com.hyde.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class test1 {

    @Autowired
    private AdminMapper adminDao;

    @Autowired
    private AdminService adminService;

    @Test
    public void simpleTest1() {
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_login", "testuser").eq("pwd_login", "testpwd");
        List<Admin> admins = adminDao.selectList(queryWrapper);
        System.out.println(admins);
    }

    @Test
    public void serviceTest(){
        List<Admin> admins = adminService.queryByUserPwd("testuser", "testpwd");
        System.out.println(admins);
    }

    @Test
    public void smbTest(){






    }





}
