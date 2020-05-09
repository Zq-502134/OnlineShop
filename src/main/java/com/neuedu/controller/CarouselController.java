package com.neuedu.controller;

import com.neuedu.pojo.Carousel;
import com.neuedu.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carousel")
public class CarouselController {

    @Autowired
    private CarouselService carouselService;

    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    public List<Carousel> getCarouselList() {
        return carouselService.getCarouselList();
    }
}
