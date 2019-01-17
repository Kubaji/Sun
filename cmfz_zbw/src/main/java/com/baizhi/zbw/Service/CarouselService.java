package com.baizhi.zbw.Service;

import com.baizhi.zbw.entity.Carousel;

import java.util.List;

public interface CarouselService {
    void CarousInsert(Carousel carousel);
    void CarousDelete(String Carouselid);
    void CarousUpdate(Carousel carousel);
    Carousel CarouselSelect(String chapterid);
    List<Carousel> CarouselList();
}
