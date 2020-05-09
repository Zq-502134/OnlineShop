package com.neuedu.service.impl;

import com.neuedu.mapper.CarouselMapper;
import com.neuedu.pojo.Carousel;
import com.neuedu.service.CarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarouselServiceImpl  implements CarouselService {

    @Autowired
    private CarouselMapper carouselMapper;
    @Override
    public List<Carousel> getCarouselList() {
        return carouselMapper.getCarouselList();
    }
}
