package xyz.eazyfree.common.demo.streamDemo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.16:45
 */
public class Iterating {
    public static List<Car> createCars() {
        return Arrays.asList(
                new Car("Jeep", "Wrangler", 2011),
                new Car("Jeep", "Comanche", 1990),
                new Car("Dodge", "Avenger", 2010),
                new Car("Buick", "Cascada", 2016),
                new Car("Ford", "Focus", 2012),
                new Car("Chevrolet", "Geo Metro", 1992)
        );

}
}
