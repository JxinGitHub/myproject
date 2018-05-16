package xyz.eazyfree.system.enums;

import lombok.Getter;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/13.21:15
 */
@Getter
public enum ResultEnum {

    UNKNOW_ERROR(-1, "位置错误"),
    SUCCESS(0, "成功"),
    AGE_SMALL(18, "年龄太小"),
    AGE_BIG(100,"年龄太大")
    ;



    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;

    private String msg;
}
