package com.baizhi.zbw.Service.Impl;
import com.baizhi.zbw.DAO.AdminDAO;
import com.baizhi.zbw.Service.AdminService;
import com.baizhi.zbw.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDAO adminDao;

    @Override
    public Map<String,String> adminLoginService(Admin admin) {
        Admin login = adminDao.login(admin);
        Map<String,String> map = new HashMap<String, String>();
        if(login!=null){
            map.put("code", "200");
            map.put("message", "登陆成功");
        }else{
            map.put("code", "400");
            map.put("message", "用户名或密码错误");

        }
        return map;
    }
}
