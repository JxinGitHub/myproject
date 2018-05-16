package xyz.eazyfree.common.demo.DesignOfPattern.StrategyPattern;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/11.10:16
 */
public class StategyMain {


    public static void main(String[] args) {
        Context context = new Context(new Add());
        int i = context.executeStrategy(2, 4);
        System.out.println(i);
    }
}
