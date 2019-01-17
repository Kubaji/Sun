package com.baizhi.zbw.Controller;

import com.baizhi.zbw.Service.CarouselService;
import com.baizhi.zbw.entity.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private CarouselService carouselService;
    @RequestMapping("/CarousInsert")
    @ResponseBody
    public void CarousInsert(Carousel carousel, MultipartFile addFile, HttpServletRequest request) throws IOException {
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        carousel.setChapterid(s);
        String filname = addFile.getOriginalFilename();
        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdir();
        }
            addFile.transferTo(new File(realPath,filname));
        carousel.setImgpath(filname);
        carouselService.CarousInsert(carousel);
    }
    @RequestMapping("/CarousDelete")
    @ResponseBody
    private void CarousDelete(String carouselid){
        carouselService.CarousDelete(carouselid);
    }
    @RequestMapping("/CarousUpdate")
    @ResponseBody
    private void CarousUpdate(Carousel carousel){
        carouselService.CarousUpdate(carousel);
    }
    @RequestMapping("/CarouselSelect")
    @ResponseBody
    private Carousel CarouselSelect(String carouselid){
       return carouselService.CarouselSelect(carouselid);
    }
    @RequestMapping("/CarouselList")
    @ResponseBody
    private List<Carousel> CarouselList(){
       return carouselService.CarouselList();
    }
}
