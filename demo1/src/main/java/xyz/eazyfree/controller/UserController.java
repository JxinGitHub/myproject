package xyz.eazyfree.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import xyz.eazyfree.domian.User;
import xyz.eazyfree.service.UserService;

import java.util.List;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    @ResponseBody
    private Object users() {
        List<User> all = service.findAll();
        return JSON.toJSON(all);
    }

/*
    @GetMapping("/aaa")
    private String index(){
        return "index";
    }
*/



}
