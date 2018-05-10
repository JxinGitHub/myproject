package xyz.eazyfree.demo.基础;

import xyz.eazyfree.domian.User;

/**
 * Created by ZhaoZhi qiang
 * 2018/4/27.9:25
 */
public class ReflectDemo {

    public static void main(String[] args) {
        User user  = new User();
        Class<? extends User> aClass = user.getClass();

        System.out.println(aClass);

        Class<?> aClass1 = null;
        try {
            aClass1 = Class.forName("xyz.eazyfree.domian.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(aClass1);


        System.out.println(aClass==aClass1);
    }

}
