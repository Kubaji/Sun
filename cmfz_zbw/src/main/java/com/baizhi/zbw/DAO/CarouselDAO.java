package com.baizhi.zbw.DAO;

import com.baizhi.zbw.entity.Carousel;

import java.util.List;

public interface CarouselDAO {
    void CarouselByInsert(Carousel carousel);
    void CarouselBydelete(String Carousel);
    void CarouselByUpdate(Carousel carousel);
    Carousel CarouselBySelect(String chapterid);
    List<Carousel> CarouselByList();
}
