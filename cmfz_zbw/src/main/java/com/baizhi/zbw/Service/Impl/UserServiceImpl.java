package com.baizhi.zbw.Service.Impl;

import com.baizhi.zbw.DAO.UserDAO;
import com.baizhi.zbw.Service.UserService;
import com.baizhi.zbw.dto.Column;
import com.baizhi.zbw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDao;
    @Override
    public List<User> queryAllService() {
        return userDao.selectUsers();
    }

    @Override
    public Column queryAllUser1() {
        return null;
    }
}
