package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Created by ZhaoZhi qiang
 * 2018/5/17.17:09
 */
@Controller
public class DemoController {

    @GetMapping(value = "/hello")
    public String test(){


        return "index";
    }

    @GetMapping("/dds")
    public String login(){


//            modelAndView.setStatus(HttpStatus.BAD_REQUEST);
        return "index";
    }


}
