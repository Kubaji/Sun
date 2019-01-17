package com.baizhi.zbw.Controller;

import com.baizhi.zbw.Service.AdminService;
import com.baizhi.zbw.entity.Admin;
import com.baizhi.zbw.util.ImageCodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;


@Controller
@RequestMapping("/login")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("getImageCode")
    @ResponseBody
    public void getImageCode(HttpServletResponse response, HttpSession session) throws IOException {
        response.setContentType("image/png");
        String code = ImageCodeUtil.getSecurityCode();
        session.setAttribute("vc", code);
        BufferedImage image = ImageCodeUtil.createImage(code);
        ImageIO.write(image, "png", response.getOutputStream());
    }
    @RequestMapping("login1")
    @ResponseBody
    public Map<String,String> login1(Admin admin, String enCode, HttpSession session){
        Map<String,String> admin2 = adminService.adminLoginService(admin);
        if(enCode!=null){
            if(enCode.equals(session.getAttribute("vc"))){
                if("200".equals(admin2.get("code"))){
                    session.setAttribute("login", "ok");
                    session.setAttribute("name", admin.getUsername());
                }
            }
        }
        return admin2;
    }
}
