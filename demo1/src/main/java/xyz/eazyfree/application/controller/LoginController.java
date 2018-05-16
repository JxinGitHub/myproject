package xyz.eazyfree.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.eazyfree.application.domian.User;
import xyz.eazyfree.application.service.UserService;

/**
 * 登陆控制器
 * Created by ZhaoZhi qiang
 *
 * @Date 2018/4/21.
 */
@Controller
public class LoginController {


        @Autowired
        private UserService userService;

        @PostMapping("/login")
        private String index( User user){
            User veriry = userService.veriry(user.getUserName());
            if (veriry.getPassword().equals(user.getPassword())) {
                return "index";
            }
            return  "system/login";
        }



        @GetMapping("/dds")
        public String login(){

            User user = new User();
            user.setUserName("张三");
            user.setPassword("123456");

//            modelAndView.setStatus(HttpStatus.BAD_REQUEST);
            return "system/login";
        }



    /**
     * 跳转
     * @return
     */
    @RequestMapping("/redirect")
    public String page2(){
        return "index";
    }


    /**
     *视图
     * @param model
     * @return
     */
    @RequestMapping("/model")
    public String page3(Model model){
        model.addAttribute("name","seawater");
        return "system/login";
    }
}



