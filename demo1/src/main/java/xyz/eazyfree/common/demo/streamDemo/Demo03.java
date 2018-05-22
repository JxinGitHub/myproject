package xyz.eazyfree.common.demo.streamDemo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.9:21
 * 迭代代码中的集合：
 *      函数组合： 在函数编程中，通常会通过一系列更小的模块化函数或运算来对复杂运行进行排序
 *      集合管道，即运算序列，将从一次运算收集的输出提供给下一次运算
 *
 *  区分表达式 和 语句
 *      表达式 ：expression   可以得到结果而不会导致变化
 *              表达式的工作更像一条链：当某个人完成一项任务时，他将结果转交给链中的下一个人。
 *              ！！！表达式没有语句所拥有的改变对象的副作用
 *      语句： statement   执行一个操作，不会产生任何结果
 *
 */
public class Demo03 {


    public static final List<String> MODELS_AFTER_2000_USING_FOR = getModelsAfter2000UsingFor(Iterating.createCars());

    public static void main(String[] args) {
        List<String> list = getModelsAfter2000UsingPipeline(Iterating.createCars());

        System.out.println(list);

        System.out.println(MODELS_AFTER_2000_USING_FOR);
    }

    //命令式编程，并获取 2000 年 后制造的汽车的名称。然后按年份对这些型号进行升序排序。
    public static List<String> getModelsAfter2000UsingFor(List<Car> cars) {

        List<Car> carsSortedByYears = new ArrayList<>();

        for (Car car: cars){
            if (car.getYear()>2000){
                carsSortedByYears.add(car);
            }
        }


        Collections.sort(carsSortedByYears, new Comparator<Car>() {
            public int compare(Car car1, Car car2) {
                return new Integer(car1.getYear()).compareTo(car2.getYear());
            }
        });

        List<String> models = new ArrayList<>();
        for(Car car : carsSortedByYears) {
            models.add(car.getModel());
        }

        return models;

    }


    /**
     * 简洁 易读 减少中间变量
     *
     * @param cars
     * @return
     */
    public static List<String> getModelsAfter2000UsingPipeline(List<Car> cars) {

        return cars.stream().filter(car -> car.getYear()>2000)
                            .sorted(Comparator.comparing(Car::getYear))
                            .map(Car::getModel) // .map(car -> car.getModel()) 被替换为一个方法引用
                            .collect(Collectors.toList());

    }




}
