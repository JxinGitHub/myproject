package xyz.eazyfree.application.domian;

import lombok.Data;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/14.17:38
 */
@Data
public class People {

    private String name;

    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(getName() + " " + getAge());
    }
}
