package xyz.eazyfree.demo.lambdademo;

/**
 * Created by ZhaoZhi qiang on 2018/4/14.
 */
public class Demo01 {

    /**
     *
     *
     * jdk1.8 之前将行为写入函数，最好的方式是匿名类
     *
     *  实现匿名类最好的方式是， 继承Runnable接口
     *
     *
     *
     */
    // Java 8之前：
    public static void main(String[] args) {

        //之前的匿名类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();


        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();

    }


}
