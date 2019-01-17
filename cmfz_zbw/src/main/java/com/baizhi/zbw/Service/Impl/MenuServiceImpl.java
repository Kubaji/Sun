package com.baizhi.zbw.Service.Impl;

import com.baizhi.zbw.DAO.MenuDAO;
import com.baizhi.zbw.Service.MenuService;
import com.baizhi.zbw.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDAO menuDAO;
    @Override
    public List<Menu> queryAllMenu() {
        return menuDAO.MenuBySelect();
    }
}
