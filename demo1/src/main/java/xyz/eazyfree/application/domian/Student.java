package xyz.eazyfree.application.domian;

import lombok.Data;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/14.17:39
 */
@Data
public class Student extends People {

    private int grade;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    private void learn(String course) {
        System.out.println( " learn " + course);
    }

}
