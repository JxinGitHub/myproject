package xyz.eazyfree.demo.DesignOfPattern.StrategyPattern;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/11.10:14
 */
public class Substract implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
}
