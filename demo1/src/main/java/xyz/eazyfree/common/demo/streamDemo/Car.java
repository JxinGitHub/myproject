package xyz.eazyfree.common.demo.streamDemo;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.16:45
 */
public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String theMake, String theModel, int yearOfMake) {
        make = theMake;
        model = theModel;
        year = yearOfMake;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

}
