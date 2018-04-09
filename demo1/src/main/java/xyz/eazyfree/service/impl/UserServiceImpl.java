package xyz.eazyfree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.eazyfree.domian.User;
import xyz.eazyfree.repository.UserRepository;
import xyz.eazyfree.service.UserService;

import java.util.List;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
