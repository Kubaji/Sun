package com.baizhi.zbw.Service;

import com.baizhi.zbw.dto.Column;
import com.baizhi.zbw.entity.User;
import java.util.List;

public interface UserService {
    List<User> queryAllService();
    Column queryAllUser1();
}
