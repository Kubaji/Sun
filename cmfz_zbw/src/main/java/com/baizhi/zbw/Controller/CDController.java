package com.baizhi.zbw.Controller;

import com.baizhi.zbw.Service.CDService;
import com.baizhi.zbw.entity.Album;
import com.baizhi.zbw.entity.Chapter;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/ad")
public class CDController {
    @Autowired
    private CDService cdService;
    @RequestMapping("queryAllAlbum")
    @ResponseBody
    public List<Album> queryAll(){
        return cdService.queryAllService();
    }
    @RequestMapping(value="/queryBY/{id}",produces="text/plain;charset=utf-8")
    @ResponseBody
    public Album queryBY(@PathVariable("id")String id){
        return cdService.queryByAlbum(id);
    }
    @RequestMapping("insert")
    @ResponseBody
    public void insert(Album album,MultipartFile file1,HttpSession session) throws Exception{
        album.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        String fileName = file1.getOriginalFilename();
        album.setCoverPath(fileName);
        cdService.insertAlbum(album);
        System.out.println(album);
        String realPath = session.getServletContext().getRealPath("/images");
        File file = new File(realPath+"/"+fileName);
        file1.transferTo(file);
    }
    @RequestMapping("insertC")
    @ResponseBody
    public void insertC( Chapter chapter,MultipartFile file1,String albumId,HttpSession session) throws Exception{
        chapter.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        String fileName = file1.getOriginalFilename();
        chapter.setSrc(fileName);
        cdService.insertChapter(chapter,albumId);
        System.out.println(chapter);
        String realPath = session.getServletContext().getRealPath("/images");
        File file = new File(realPath+"/"+fileName);
        file1.transferTo(file);
    }
    @RequestMapping(value="down")
    public void down(String src,HttpSession session,HttpServletResponse response) throws Exception{

        String realPath = session.getServletContext().getRealPath("/images");
        File file = new File(realPath+"/"+src);
        byte[] bs = FileUtils.readFileToByteArray(file);
        response.setHeader("content-disposition", "attachment;filename="+URLEncoder.encode(new Date().getTime()+""+src, "utf-8"));
        ServletOutputStream out = response.getOutputStream();
        FileUtils.copyFile(file, out);
        out.write(bs);
        if(out!=null){out.flush();}
        if(out!=null){out.close();}
    }
}
