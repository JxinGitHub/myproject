package xyz.eazyfree.common.demo.基础;

import xyz.eazyfree.application.domian.People;
import xyz.eazyfree.application.domian.User;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by ZhaoZhi qiang
 * 2018/4/27.9:25
 */
public class ReflectDemo2 {



    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        //Class<People> peopleClass = People.class;

        Class<People> peopleClass = null;
        try {
            peopleClass = (Class<People>) Class.forName("xyz.eazyfree.application.domian.People");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<? super People> superclass = peopleClass.getSuperclass();
        Method[] methods = peopleClass.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }


        ClassLoader classLoader = peopleClass.getClassLoader();
        Type[] genericInterfaces = peopleClass.getGenericInterfaces();
        AnnotatedType[] annotatedInterfaces = peopleClass.getAnnotatedInterfaces();
        Field[] fields = peopleClass.getFields();




        People people = peopleClass.newInstance();
        people.speak();
    }

}
