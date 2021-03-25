package com.atguigu.controller;

import com.atguigu.bean.Star;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo02")
public class Example02 {



    @RequestMapping("/star")
    public List<Star> getStar(){
        List<Star> stars = new ArrayList<>();
        stars.add(new Star("bingbing",18,1000));
        stars.add(new Star("chenglong",21,5000));
        return  stars;
    }

}
