package com.hyde.Controller;

import com.hyde.Service.AdminService;
import com.hyde.entity.Admin;
import com.hyde.entity.QueryResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.hyde.entity.ResultConstant.*;

@CrossOrigin
@RequestMapping("/admin")
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/queryUser")
    @ResponseBody
    public QueryResult queryUser(String user,String pwd){
        List<Admin> admins = adminService.queryByUserPwd(user, pwd);
        if (admins.isEmpty()){
            return new QueryResult(RESULT_FAIL, "current user not exist");
        }

        return new QueryResult(admins,RESULT_OK,"query success");
    }


}
