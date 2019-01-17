package com.baizhi.zbw.Controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.baizhi.zbw.Service.UserService;
import com.baizhi.zbw.dto.Column;
import com.baizhi.zbw.entity.User;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/queryAll")
    @ResponseBody
    public List<User> queryAll(){
        List<User> selectUsers = userService.queryAllService();
        return selectUsers;
    }
    @RequestMapping("/queryAll1")
    @ResponseBody
    public Column queryAll1(){
        System.out.println(userService.queryAllUser1()+"===================================================================");
        return userService.queryAllUser1();

    }
    @RequestMapping(value="/download")
    public void download(HttpServletResponse response) throws FileNotFoundException, IOException{
        List<User> selectUsers = userService.queryAllService();
        File file = new File("E:\\笔记库\\用户.xlsx");
        byte[] bs = FileUtils.readFileToByteArray(file);
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("content-disposition", "attachment;filename=用户.xls");
        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户信息","用户表"),User.class,selectUsers);

        workbook.write(response.getOutputStream());
        ServletOutputStream out = response.getOutputStream();
        FileUtils.copyFile(file, out);
        out.write(bs);
        workbook.close();
        out.flush();out.close();
    }
}
