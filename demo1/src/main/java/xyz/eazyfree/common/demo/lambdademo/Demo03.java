package xyz.eazyfree.common.demo.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ZhaoZhi qiang on 2018/4/14.
 */
public class Demo03 {

    /**
     *
     * 用lambda表达式和函数式接口Predicate
     *  java.util.function。它包含了很多类，用来支持Java的函数式编程
     * 其中一个便是Predicate
     */
    public static void main(String[] args) {

        // Java 8之前：
        List<String> list = Arrays.asList("foo","bar","baz","qux");
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Print all languages :");
        fliter(languages, (str)->true);

        System.out.println("Print no language : ");
        fliter(languages, (str)->false);



    }

    public static void fliter(List<String> names , Predicate condition){
        for (String name: names){
            if (condition.test(name)){
                System.out.println(name+" ");
            }
        }
    }


}
