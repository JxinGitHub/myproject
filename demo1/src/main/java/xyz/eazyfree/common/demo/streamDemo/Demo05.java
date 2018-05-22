package xyz.eazyfree.common.demo.streamDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.20:33
 */
public class Demo05 {

    /**
     * 函数组合中垂直对齐点的约定
     * @param args
     */
    public static void main(String[] args) {
        int sum = IntStream.iterate(1, operand -> operand + 1)
                .limit(100)
                .sum();
        System.out.println(sum);
//                   .forEach(value -> System.out.println(value));

        int sum1 = IntStream.iterate(1, e -> e + 3)
                .sum();
        System.out.println(sum1);
    }


    /**
     * 将内部类替换为 lambda表达式
     */
    public static void test3(){
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        IntStream.range(0,6)
                .forEach(i ->
                executorService.submit(()-> System.out.println("running test 03 ..."+i)));
    }


    public static void test2(){
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0,5)
                .forEach(i->
                executorService.submit(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("running task" + i);
                    }
                }));



    }



    public static void test1(){

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i = 0; i < 5; i++) {
            int temp = i;

            executorService.submit(new Runnable() {
                public void run() {
                    //If uncommented the next line will result in an error
                    //System.out.println("Running task " + i);
                    //local variables referenced from an inner class must be final or effectively final

                    System.out.println("Running task " + temp);
                }
            });
        }

        executorService.shutdown();

    }
}


