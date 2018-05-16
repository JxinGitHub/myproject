package xyz.eazyfree.common.demo.DesignOfPattern.ProxyPattern;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/11.12:34
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage==null){
            realImage = new RealImage(fileName);
        }

        realImage.display();

    }
}
