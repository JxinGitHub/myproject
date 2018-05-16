package xyz.eazyfree.common.demo.lambdademo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ZhaoZhi qiang on 2018/4/15.
 */
public class Test {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("foo", "bar", "baz", "qux");

        long count = list.stream().count();

        Stream<String> distinct = list.stream().distinct();

        Stream<String> sorted = list.stream().sorted();

        System.out.println("---");
    }
}
