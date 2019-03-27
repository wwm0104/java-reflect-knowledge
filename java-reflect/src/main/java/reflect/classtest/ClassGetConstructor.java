package reflect.classtest;

import reflect.po.Son;

import java.lang.reflect.Constructor;

/**
 * 获取构造器
 *getConstructors 返回该类的所有的public的构造器
 *getDeclaredConstructors 返回该类所有的的构造器(包含私有)
 *
 */
public class ClassGetConstructor {

    public static void main(String[] args) {
        try {
            Constructor<?>[] constructors = Son.class.getConstructors();
            for(Constructor constructor:constructors){
                System.out.println("获取该类public的构造器:"+constructor.getName());
            }
            System.out.println("---------------------------");
            Constructor<Son> constructor1 = Son.class.getConstructor(int.class);
            System.out.println("获取该类指定的public的构造器:"+constructor1.getName());
            System.out.println("---------------------------");
            Constructor<?>[] declaredConstructors = Son.class.getDeclaredConstructors();
            for(Constructor constructor:declaredConstructors){
                System.out.println("获取该类所有的构造器:"+constructor.getName());
            }
            System.out.println("---------------------------");
            Constructor<Son> declaredConstructor = Son.class.getDeclaredConstructor(String.class);
            System.out.println("获取该类指定的构造器:"+declaredConstructor.getName());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
