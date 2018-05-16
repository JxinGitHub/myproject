package xyz.eazyfree.application.domian;

import lombok.Data;

/**
 *
 * http请求返回的最外层对象
 * Created by ZhaoZhi qiang
 * 2018/5/13.19:02
 *
 */
@Data
public class Result <T>{

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体的内容. */
    private T data;


}
