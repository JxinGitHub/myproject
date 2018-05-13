package xyz.eazyfree.demo.DesignOfPattern.ProxyPattern;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/11.12:36
 */
public class ProxyMain {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();

        System.out.println("");

        image.display();
    }
}
