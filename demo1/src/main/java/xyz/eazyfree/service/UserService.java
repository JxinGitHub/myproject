package xyz.eazyfree.service;

import xyz.eazyfree.domian.User;

import java.util.List;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
public interface UserService {
    List<User> findAll();

    //接口定义方式实现，用default
    default void test(){

    }

}
