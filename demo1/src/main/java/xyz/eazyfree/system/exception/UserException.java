package xyz.eazyfree.system.exception;

import lombok.Data;
import xyz.eazyfree.system.enums.ResultEnum;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/13.21:01
 */
@Data
public class UserException extends RuntimeException {
    //springboot 在RuntimeException 会事务回滚

    private Integer code;


    public UserException(Integer code ,String message) {
        super(message);
        this.code = code;
    }

    public UserException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
