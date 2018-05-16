package xyz.eazyfree.common.demo.基础.面试;

import java.util.*;

/**
 * ArrayList、LinkedList、Vector的区别
 * Created by ZhaoZhi qiang
 * 2018/5/15.15:47
 */
public class Demo01 {

    public static void main(String[] args) {
        List arrayList = new ArrayList(); //ArrayList是一个可变”数组
        Collections.synchronizedCollection(arrayList);

        List linkedList = new LinkedList();// 一个双向列表
        Collections.synchronizedList(linkedList); //变成线程安全
            //使用节点存放数据 插入或者增加的效率要高与 ArrayList 查询效率要低


        List vectorList = new Vector();
        //Vector 是线程安全的 ，其他 和 ArrayList 比较类似，



    }

}
