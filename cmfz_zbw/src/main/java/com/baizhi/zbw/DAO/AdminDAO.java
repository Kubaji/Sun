package com.baizhi.zbw.DAO;

import com.baizhi.zbw.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDAO {
    Admin login(Admin admin);
}
