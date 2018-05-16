package xyz.eazyfree.application.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/12.19:50
 */
@Controller
public class ResponseController {


    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity test() {

        ResponseEntity responseEntity = new ResponseEntity(HttpStatus.MULTI_STATUS);

        return responseEntity;

    }


}
