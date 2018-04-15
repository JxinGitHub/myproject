package xyz.eazyfree.demo.lambdademo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhaoZhi qiang on 2018/4/14.
 */
public class Demo02 {

    /**
     *
     * 用lambda表达式对列表进行迭代
     *
     */
    public static void main(String[] args) {

        // Java 8之前：
        List<String> list = Arrays.asList("foo","bar","baz","qux");
     /*   for (String string:list) {
            System.out.println(string);
        }*/

        //now
        list.forEach(n -> System.out.println(n));
        System.out.println("----------");
        list.forEach(System.out::println);

    }


}
