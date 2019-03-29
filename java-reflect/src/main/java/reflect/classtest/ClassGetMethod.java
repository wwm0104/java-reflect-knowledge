package reflect.classtest;

import reflect.po.Son;

import java.lang.reflect.Method;

/**
 *获取方法
 * get* 获取所有的public方法
 * getDeclared* 获取该类所有的方法包含私有
 */
public class ClassGetMethod {
    public static void main(String[] args) {
        try {
            Method[] methods = Son.class.getMethods();
            for(Method method:methods){
                System.out.println("获取所有的public方法:"+method.getName());
            }
            System.out.println("-------------------");
            Method sonTest3 = Son.class.getMethod("sonTest3");
            System.out.println("获取特定的public方法:"+sonTest3.getName());
            System.out.println("-------------------");
            Method[] declaredMethods = Son.class.getDeclaredMethods();
            for(Method method:declaredMethods){
                System.out.println("获取该类所有的方法包含私有:"+method.getName());
            }
            System.out.println("-------------------");
            Method sonTest1 = Son.class.getDeclaredMethod("sonTest1");
            System.out.println("获取该类特定的方法包含私有:"+sonTest1.getName());
            System.out.println("-------------------");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
