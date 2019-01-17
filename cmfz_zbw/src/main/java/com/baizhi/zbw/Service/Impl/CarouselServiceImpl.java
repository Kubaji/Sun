package com.baizhi.zbw.Service.Impl;

import com.baizhi.zbw.DAO.CarouselDAO;
import com.baizhi.zbw.Service.CarouselService;
import com.baizhi.zbw.entity.Carousel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("carouselService")
public class CarouselServiceImpl implements CarouselService {
    @Autowired
    private CarouselDAO carouselDAO;
    @Override
    public void CarousInsert(Carousel carousel) {
        carouselDAO.CarouselByInsert(carousel);
    }

    @Override
    public void CarousDelete(String Carouselid) {
        carouselDAO.CarouselBydelete(Carouselid);
    }

    @Override
    public void CarousUpdate(Carousel carousel) {
        carouselDAO.CarouselByUpdate(carousel);
    }

    @Override
    public Carousel CarouselSelect(String chapterid) {
        return carouselDAO.CarouselBySelect(chapterid);
    }

    @Override
    public List<Carousel> CarouselList() {
        return carouselDAO.CarouselByList();
    }
}
