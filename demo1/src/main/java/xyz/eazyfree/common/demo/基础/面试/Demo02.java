package xyz.eazyfree.common.demo.基础.面试;

import jdk.nashorn.internal.objects.NativeUint8Array;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * HashMap和HashTable的区别，Hashmap实现原理
 * ConcurrntHashMap 呢
 * Created by ZhaoZhi qiang
 * 2018/5/15.16:01
 */
public class Demo02 {

    // 都是基于哈希表来实现key-value映射的工具类

    // HashMap 继承自 AbstractMap ; HashTable 继承自 Dictionary

    //HashMap 支持 null key || value ,将null 的hashcode值定义为0          HashTable 不支持

    // HashTable 是线程安全的，但是已经被淘汰了，可以使用ConcurrentHashMap()代替



    // 由链表改为红黑树
  public static void main(String[] args) {

        Map hashMap = new HashMap();
        hashMap.put(null,null);

        Map hashTable = new Hashtable();
       // hashTable.put(null,null); //抛出空指针异常

        Map concurrentHashMap = new ConcurrentHashMap();


    }

}
