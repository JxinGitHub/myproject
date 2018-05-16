package xyz.eazyfree.application.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;


/**
 * Created by ZhaoZhi qiang
 * on 2018/4/9.
 */
@Repository
public class RedisRepository {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;




}
