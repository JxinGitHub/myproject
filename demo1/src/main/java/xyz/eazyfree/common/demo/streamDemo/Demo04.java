package xyz.eazyfree.common.demo.streamDemo;

import com.vividsolutions.jts.io.InStream;

import java.util.stream.IntStream;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/21.17:44
 * IntStream
 *          方法 range、iterate 和 limit 来迭代范围和跳过范围中的值。
 *          您还将了解新的 takeWhile 和 dropWhile 方法
 */
public class Demo04 {

    public static void main(String[] args) {

        System.out.print("Get set...");
        for(int i = 1; i < 4; i++) {
            System.out.print(i + "...");
        }

        // 不会强迫初始化某个可变变量  迭代会自动进行，不需要定义增量
        System.out.print("Get set ...");
        IntStream.range(1,4)
                 .forEach(i -> System.out.println(i+ " ..."));


        IntStream.range(1,4)
                .forEach(System.out::print);


    }

}
