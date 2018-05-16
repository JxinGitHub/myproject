package xyz.eazyfree.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/10.10:50
 */
@Component
@ConfigurationProperties(prefix = "website")
@Data
public class WebsiteProperties {

    /**
     * 网站作者
     */
    private String author;

    /**
     * 网站主题
     */
    private String theme;


}
