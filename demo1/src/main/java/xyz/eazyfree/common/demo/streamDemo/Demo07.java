package xyz.eazyfree.common.demo.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.23:03
 *
 * 如果 lambda 表达式的目的仅是将一个形参传递给实例方法，
 *          那么可以将它替换为实例上的方法引用。
 * 如果传递表达式要传递给静态方法，
 *          可以将它替换为类上的方法引用。
 */
public class Demo07 {

    /**
     * 将传递lambda表达式替换为引用
     * pass-through lambdas
     */

    public static void main(String[] args) {
        test1();
    }
    /**
     * 一个传递lambda表达式
     *
     * 传递给 forEach() 的lambda就是我们所谓的 传递lambda表达式
     *   表达式 e -> System.out.println(e) 将他的形参作为实参传递给 PrintStream 类的println 方法
     *    该方式是 System.out 的实例
     *
     */
    public static void test1() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream()
                .filter(e -> e % 2 == 0) //第一个表达式实际执行了一些工作
                .forEach(e -> System.out.println(e)); //第二个没有  这个就是 传递lambda表达式
        integers.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }


    /**
     * 传递形参作为实参
     */
    public static void test2(){
        //从形参到实例方法的实参
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream()
                .filter(e -> e % 2 == 0)  // variable --> reference.instanceMethod(variable)
                .forEach(System.out::println); //referenceToInstance::methodName

    }

    /**
     * this 上的一个方法实参
     * 前面的传递表达式的一种特殊情况是，在当前方法的 context 实例上调用实例方法。
     *     假设我们有一个名为 Example 的类，其中包含一个实例方法 increment：
     */
    public void test3(){
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream()
                .map(e -> increment(e)); //将一个实参传递给实例方法的 lambda表达式

        //稍微重写一下这个方法
       // 引入冗余的 this 作为对 increment 的调用的目标，
        // 以让传递表达式的结构变得清晰。现在我们可以通过方法引用轻松地解决冗余问题：
        integers.stream()
                .map(e -> this.increment(e));

        //方法引用解决冗余问题
        integers.stream()
                .map(this::increment);

    }

    public int increment(int n){
        return n+1;
    }


    /**
     * 将形参传递给静态方法
     * .map(e -> Integer.valueOf(e))
     */
    public static void test4(){
        Stream.of("1")
                .map(Integer::valueOf);
    }




}


