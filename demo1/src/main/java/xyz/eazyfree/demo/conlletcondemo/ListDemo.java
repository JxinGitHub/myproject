package xyz.eazyfree.demo.conlletcondemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhaoZhi qiang
 * on 2018/4/16.
 */
public class ListDemo {

    public static void main(String[] args) {
        List list = new ArrayList();
        boolean foo = list.add("foo");
        boolean add = list.add(1);
        list.add(0,"aa");

        boolean add1 = list.addAll(0,Arrays.asList("bar", "baz"));

        boolean contains = list.contains(list.get(0));
        System.out.println(contains);
//        list.clear();
        boolean contains1 = list.containsAll(Arrays.asList("bar", "baz"));
        System.out.println(contains1);


        list.retainAll(Arrays.asList("bar", "baz"));

        list.forEach(System.out::print);
    }


}
