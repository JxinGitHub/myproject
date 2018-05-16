package xyz.eazyfree.common.demo.AnnotationDemo;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * Created by ZhaoZhi qiang
 * 2018/5/15.16:37
 */

//定义一个空注解 什么也不做

//功能 解释说明 1. 生成文档 @See @Return @ Param
// 2. 注入依赖 实现配置
// 3. 编译时进行格式检查 @Override

@Target({TYPE,METHOD,FIELD,CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME) //VM将在运行期也保留注释，因此可以通过反射机制读取注解的信息。
@Inherited //允许子类继承父类中的注解
public @interface Test {
    String name();
    int id() default 0;
    Class<Long> gid();

}
