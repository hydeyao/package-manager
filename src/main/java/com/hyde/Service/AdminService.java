package com.hyde.Service;

import com.hyde.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    List<Admin> queryByUserPwd(String user,String pwd);


}
