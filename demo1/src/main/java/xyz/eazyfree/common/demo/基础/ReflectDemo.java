package xyz.eazyfree.common.demo.基础;

import xyz.eazyfree.application.domian.User;

/**
 * Created by ZhaoZhi qiang
 * 2018/4/27.9:25
 */
public class ReflectDemo {

    /**
     * 反射是可以让我们在运行时获取类的方法，属性，父类，接口等类的内部信息的机制
     *  根据一个类的Class对象获取它的定义信息
     *
     *    我们知道使用javac能够将.java文件编译为.class文件，
     *    这个.class文件包含了我们对类的原始定义信息（父类、接口、构造器、属性、方法等）
     *    。.class文件在运行时会被ClassLoader加载到Java虚拟机（JVM）中，
     *    当一个.class文件被加载后，JVM会为之生成一个Class对象，
     *    我们在程序中通过new实例化的对象实际上是在运行时根据相应的Class对象构造出来的。
     */

    public static void main(String[] args) {


        User user  = new User();
        Class<? extends User> aClass = user.getClass();

        System.out.println(aClass);

        Class<?> aClass1 = null;
        try {
            aClass1 = Class.forName("xyz.eazyfree.application.domian.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(aClass1);


        System.out.println(aClass==aClass1);
    }

}
