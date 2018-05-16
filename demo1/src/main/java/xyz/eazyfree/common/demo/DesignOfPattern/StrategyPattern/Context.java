package xyz.eazyfree.common.demo.DesignOfPattern.StrategyPattern;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/11.10:14
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a , int b){
        return strategy.doOperation(a, b);
    }

}
