package com.baizhi.zbw.Controller;

import com.baizhi.zbw.Service.MenuService;
import com.baizhi.zbw.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @RequestMapping(value = "/queryAllMenu")
    @ResponseBody
    public List<Menu> queryAllMenu(){
        System.out.println(menuService.queryAllMenu()+"----------------------------------------------");
        return menuService.queryAllMenu();
    }
}
