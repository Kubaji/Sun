package com.baizhi.zbw.Service;

import com.baizhi.zbw.entity.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface AdminService {
    Map<String,String> adminLoginService(Admin admin);
}
