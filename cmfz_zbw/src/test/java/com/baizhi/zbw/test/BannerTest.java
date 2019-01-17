package com.baizhi.zbw.test;
import com.baizhi.zbw.DAO.CarouselDAO;
import com.baizhi.zbw.Service.CarouselService;
import com.baizhi.zbw.entity.Carousel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;
public class BannerTest {
    private CarouselService cs;
    @Before
    public void getApplicationContext(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("Spring.xml");
        cs = (CarouselService) ac.getBean("carouselService");
    }
    @Test
    public void testList(){
        List<Carousel> carousels = cs.CarouselList();
        System.out.println(carousels+"././.");
        carousels.forEach((s) -> {System.out.print(s+"////");});
    }
    @Test
    public void testes(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        CarouselDAO ba= (CarouselDAO) context.getBean("carouselDAO");
        ba.CarouselByInsert(new Carousel("7","经院正殿", "1.jpg", "4444444444", 1,new Date()));
    }
    @Test
    private void tes(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        CarouselDAO b= (CarouselDAO) context.getBean("carouselDAO");

    }
}
