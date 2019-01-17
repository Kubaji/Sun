package com.baizhi.zbw.DAO;

import com.baizhi.zbw.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> selectUsers();
    List<String> selectMonth(Integer gender);
    List<Integer> selectCount(Integer gender);
}
