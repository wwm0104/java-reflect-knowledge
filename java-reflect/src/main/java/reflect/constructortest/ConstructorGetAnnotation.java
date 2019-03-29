package reflect.constructortest;

import reflect.po.Book;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/**
 * 获取注解
 */
public class ConstructorGetAnnotation {
    public static void main(String[] args) {
        Constructor<?>[] declaredConstructors = Book.class.getDeclaredConstructors();
        for(Constructor constructor:declaredConstructors){
            Annotation[] annotations = constructor.getAnnotations();
            System.out.println("构造器上的注解:"+annotations.length);
            Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
            System.out.println("构造器上的注解:"+declaredAnnotations.length);
            System.out.println("构造器名称:"+constructor.getName());
            System.out.println("所属类的名称:"+constructor.getDeclaringClass().getName());

        }
    }
}
