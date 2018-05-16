package xyz.eazyfree.system.handle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.eazyfree.application.domian.Result;
import xyz.eazyfree.system.exception.UserException;
import xyz.eazyfree.common.utils.ResultUtil;


/**
 * Created by ZhaoZhi qiang
 * 2018/5/13.20:53
 */
@ControllerAdvice
@Component //springboot 2 版本之后需要增加这个
@Slf4j
public class ExceptionHandle {

    /**
     * 异常被捕获之后，报错不会在控制台显示，无法排查
     *  此时就要用到日志了
     * @param e
     * @return
     */

    // service 抛异常给 controller ，最后捕获异常处理
    @ResponseBody
    @ExceptionHandler(value = Exception.class)//声明捕获那个异常类
    public Result handle(Exception e) {
        if (e instanceof UserException){
            UserException userException = (UserException)e;
            return ResultUtil.error(userException.getCode(),e.getMessage());

        }else {
            log.error("【x系统异常】{}"+e);
            return ResultUtil.error(-1,"未知错误");
        }
    }

//    @ResponseBody
//    @ExceptionHandler(value = UserException.class)//声明捕获那个异常类
//    public Result handle(UserException e) {
//        return ResultUtil.error(e.getCode(),e.getMessage());
//    }

}
