package xyz.eazyfree.common.demo.AnnotationDemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/15.18:53
 */
public class ParseAnnation {


    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotation();
    }


    /**
     * 打印出UserAnnotation 类中所使用到的类注解
     *
     * @throws ClassNotFoundException
     */
    public static void parseTypeAnnotation() throws ClassNotFoundException {

        Class<Test> clazz = (Class<Test>) Class.forName("xyz.eazyfree.common.demo.AnnotationDemo.UserAnnotation");

        Annotation[] annotations = clazz.getAnnotations();

        for (Annotation annotation : annotations) {
            Test test = (Test) annotation;
            System.out.println("id= \"" + test.id() + "\"; name= \"" + test.name() + "\"; gid = " + test.gid());
        }


    }


    /**
     * 简单打印出UserAnnotation 类中所使用到的方法注解
     * 该方法只打印了 Method 类型的注解
     *
     * @throws ClassNotFoundException
     */
    public static void parseMethodAnnotation() {
        Method[] methods = UserAnnotation.class.getDeclaredMethods();
        for (Method method : methods) {
            /*
            * 判断方法中是否有指定注解类型的注解
            */
            boolean hasAnnotation = method.isAnnotationPresent(Test.class);
            if (hasAnnotation) {
                /*
                * 根据注解类型返回方法的指定类型注解
                */
                Test annotation = method.getAnnotation(Test.class);
                System.out.println("method = " + method.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }

    /**
     * 简单打印出UserAnnotation 类中所使用到的方法注解
     * 该方法只打印了 Method 类型的注解
     *
     * @throws ClassNotFoundException
     */
    public static void parseConstructAnnotation() {
        Constructor[] constructors = UserAnnotation.class.getConstructors();
        for (Constructor constructor : constructors) {
            /*
            * 判断构造方法中是否有指定注解类型的注解
            */
            boolean hasAnnotation = constructor.isAnnotationPresent(Test.class);
            if (hasAnnotation) {
                /*
                * 根据注解类型返回方法的指定类型注解
                */
                Test annotation = (Test) constructor.getAnnotation(Test.class);
                System.out.println("constructor = " + constructor.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= " + annotation.gid());
            }
        }
    }


}
