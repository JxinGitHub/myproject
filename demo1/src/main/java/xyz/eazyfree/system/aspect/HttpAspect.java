package xyz.eazyfree.system.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/13.17:49
 */
@Aspect
@Component
@Slf4j
public class HttpAspect {


    // 如果和下面的代码同时存在， z则先显示下面的代码
//   @Before("execution(public * xyz.eazyfree.application.controller.UserController.*(..))") //两个点 表示无论几个参数，都被拦截
//    public void doBefore1(){
//        System.out.println(111);
//    }
//
//    @After("execution(public * xyz.eazyfree.application.controller.UserController.*(..))") //两个点 表示无论几个参数，都被拦截
//    public void doAfter1(){
//        System.out.println(2222);
//    }

    //定义切点
    @Pointcut("execution(public * xyz.eazyfree.application.controller.UserController.*(..))") //两个点 表示无论几个参数，都被拦截
    public void log(){
    }

    @Before("log()")
     public void doBefore(JoinPoint joinpoint){
        System.out.println(111 + "before");
        //url
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("url={}",request.getRequestURL());
        // method
        log.info("method={}",request.getMethod());

        //ip
        log.info("ip={}",request.getRemoteAddr());

        //类方法
        log.info("class_method={}",joinpoint.getSignature().getDeclaringTypeName()
        +"."+joinpoint.getSignature().getName());

        //参数
        log.info("args={}",joinpoint.getArgs());
     }


    @Before("log()")
    public void doAfter(){
        System.out.println(111 + "after");

    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        log.info("response={}",object);
    }
}
