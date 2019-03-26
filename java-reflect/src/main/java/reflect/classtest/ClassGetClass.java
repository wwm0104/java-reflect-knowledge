package reflect.classtest;

import reflect.po.Son;

import java.lang.reflect.Type;

public class ClassGetClass {
    public static void main(String[] args) {
        Class<?>[] classes = Son.class.getClasses();
        for(Class aClass:classes){
            System.out.println("获取该类及父类所有的公共的内部类或者内部接口:"+aClass.getName()+",获取声明的类:"+aClass.getDeclaringClass().getName());
        }
        System.out.println("------------------------");
        Class<?>[] declaredClasses = Son.class.getDeclaredClasses();
        for(Class aClass:declaredClasses){
            System.out.println("获取该类上自己的内部类或者内部接口:"+aClass.getName()+",获取声明的类:"+aClass.getDeclaringClass().getName());
        }
        System.out.println("------------------------");
        Class<? super Son> superclass = Son.class.getSuperclass();
        System.out.println("返回直接继承的父类(没有泛型):"+superclass.getName());
        Type genericSuperclass = Son.class.getGenericSuperclass();
        System.out.println("返回直接继承的父类(有泛型):"+genericSuperclass.getTypeName());
    }
}
