package xyz.eazyfree.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/14.10:41
 */
@Configuration
public class RestConfig {


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
