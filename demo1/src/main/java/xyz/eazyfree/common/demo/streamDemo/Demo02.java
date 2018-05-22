package xyz.eazyfree.common.demo.streamDemo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.9:21
 *
 *    由命令式编程     ->    声明式编程        ->    函数式编程
 * tell what and how  ->   tell what not how  ->   声明式函数+高阶函数
 *
 * 高阶函数 区别普通函数，{
 *      普通函数是将  对象作为方法参数 ， 在函数中创建对象， 返回对象
 *      高阶函数： 是将 函数作为方法参数 ， 在函数中创建函数， 返回一个函数
 * }
 *
 */
public class Demo02 {


    public static void main(String[] args) {

        Map<String, Integer> pageVisits = new HashMap<>();


        String page = "https://agiledeveloper.com";

        incrementPageVisit(pageVisits,page);
        incrementPageVisit(pageVisits,page);
        System.out.println(pageVisits.get(page));

    }


    public static void incrementPageVisit(Map<String, Integer> pageVisits, String page) {
        pageVisits.merge(page,1,(oldvalue,value)->oldvalue+value);
    }


}
