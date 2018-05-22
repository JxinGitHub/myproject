package xyz.eazyfree.common.demo.streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.22:02
 */
public class Demo06 {


    /**
     * 组合函数中垂直对齐点的约定
     */
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }


    public static void test3(){

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(
            integers.stream()
                .filter(e -> e>3)
                .filter(e -> e%2==0)
                .filter(e -> e<8)
                .mapToInt(e-> e*2)
                .sum()
        );
    }


    public static void test2(){
        List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
        System.out.println(
                names.stream()
                    .filter(name -> name.length() == 4)
                    .collect(Collectors.joining(", "))
        );

    }

    public static void test1(){
        List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");

        List<String> subList = new ArrayList<>();
        for(String name : names) {
            if(name.length() == 4)
                subList.add(name);
        }

        StringBuilder namesOfLength4 = new StringBuilder();
        for(int i = 0; i < subList.size() - 1; i++) {
            namesOfLength4.append(subList.get(i));
            namesOfLength4.append(", ");
        }

        if(subList.size() > 1)
            namesOfLength4.append(subList.get(subList.size() - 1));

        System.out.println(namesOfLength4);
    }

}
