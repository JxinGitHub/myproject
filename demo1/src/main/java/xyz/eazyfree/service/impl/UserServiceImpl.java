package xyz.eazyfree.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import xyz.eazyfree.domian.User;
import xyz.eazyfree.enums.ResultEnum;
import xyz.eazyfree.exception.UserException;
import xyz.eazyfree.repository.UserRepository;
import xyz.eazyfree.service.UserService;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Optional;

/**
 * Created by ZhaoZhi qiang on 2018/4/9.
 */
@Service
@Slf4j
@CacheConfig(cacheNames = "users")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;


    @Autowired
    UserRepository userRepository;

    @Override
    @CachePut(value = "user", key = "110")
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User insertByUser(User user) {
        log.info("新增用户：" + user.toString());
        return userRepository.save(user);
    }

    @Override
    @CachePut(key = "#p0.id")
    public User update(User user) {
        log.info("更新用户：" + user.toString());
        return userRepository.save(user);
    }

    @Override
    @CacheEvict(key = "#p0")
    public User delete(Integer id) {
        User user = userRepository.findById(id).get();
        userRepository.delete(user);

        log.info("删除用户：" + user.toString());
        return user;
    }

    @Override
    @Cacheable(key = "#p0")
    public User findById(Integer id) {
        log.info("获取用户 ID ：" + id);
        return userRepository.findById(id).get();
    }
    @Override
    public User veriry(String userName) {
        return repository.findByUserName(userName);
    }

    @Override
    public void getAge(Integer id) throws Exception{
        User user = repository.findUserByUserId(id);

        Integer age = Integer.parseInt(user.getAge());

        if (age<18)
            throw new UserException(ResultEnum.AGE_SMALL);
        else if (age>100)
            throw new UserException(ResultEnum.AGE_BIG);

    }


}
