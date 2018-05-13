package xyz.eazyfree.demo.DesignOfPattern.ProxyPattern;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/11.12:30
 */
public class RealImage implements Image{

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying...."+filename);
    }

    private void loadFromDisk(String filename) {
        System.out.println("loading...."+filename);
    }
}
