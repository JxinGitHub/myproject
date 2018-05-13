package xyz.eazyfree.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/13.11:00
 *     在项目服务启动时去加载一些数据或者处理一些事情，只需要实现CommandLineRunner
 */
@Component
@Order(3) //多个实现类执行优先级是按照value值从小到大的排序
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
//        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据2操作<<<<<<<<<<<<<");
    }


}

@Component
@Order(2)
class DataLoader2 implements CommandLineRunner{

    @Override
    public void run(String... strings) throws Exception {
//        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据1操作<<<<<<<<<<<<<");
    }
}