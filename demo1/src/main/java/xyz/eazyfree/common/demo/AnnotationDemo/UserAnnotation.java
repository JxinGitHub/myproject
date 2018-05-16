package xyz.eazyfree.common.demo.AnnotationDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/15.16:51
 */

@Test(name = "type" , gid = Long.class) //使用的类的注解
public class UserAnnotation {

    @Test(name = "param" ,id = 2 , gid = Long.class)//使用类成员的注解
    private Integer age;

    @Test(name = "construct",id = 2, gid = Long.class) //使用构造方法注解
    public UserAnnotation() {
    }

    public UserAnnotation(Integer age) {
        this.age = age;
    }

    @Test(name="public method",id=3,gid=Long.class) //使用类方法注解
    public void method(){

        Map map = new HashMap();
        System.out.println(".......");
    }


    @Test(name="protected method",id=4,gid=Long.class) //类方法注解
    protected void b(){
        Map<String,String> m = new HashMap<String,String>(0);
    }
    @Test(name="private method",id=5,gid=Long.class) //类方法注解
    private void c(){
        Map<String,String> m = new HashMap<String,String>(0);
    }

}
