package xyz.eazyfree.service;

import xyz.eazyfree.domian.User;

import java.util.List;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
public interface UserService {
    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Integer id);

    User findById(Integer id);

    //用户登陆验证
    User veriry(String userName);

}
