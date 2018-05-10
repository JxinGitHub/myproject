package xyz.eazyfree.config;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/10.10:54
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class WebsitePropertiesTest {

    @Autowired
    private WebsiteProperties websiteProperties;

    @Test
    public void test(){

        Assert.assertEquals(websiteProperties.getAuthor(),"eazyfree");

    }


}
