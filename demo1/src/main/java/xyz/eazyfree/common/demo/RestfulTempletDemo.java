package xyz.eazyfree.common.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xyz.eazyfree.application.domian.Result;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/14.9:28
 *
 * 一个使用restful 发送请求的小demo
 */
@RestController
public class RestfulTempletDemo {

    @Autowired
    private   RestTemplate restTemplate;

    @GetMapping("/restful")
    public Result test(){
        Result forObject = restTemplate.getForObject("http://localhost/users/getAge/1", Result.class);

        System.out.println(forObject);
        return  forObject;
    }

    @GetMapping("/restful1")
    public Object test1(){
        Object forObject = restTemplate.getForObject("https://www.baidu.com", Object.class);

        System.out.println(forObject);
        return  forObject;
    }

}
