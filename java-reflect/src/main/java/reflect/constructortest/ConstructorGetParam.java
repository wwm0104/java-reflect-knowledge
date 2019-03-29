package reflect.constructortest;

import reflect.po.Book;

import java.lang.reflect.Constructor;

/**
 * 获取参数
 */
public class ConstructorGetParam {
    public static void main(String[] args) {
        Constructor<?>[] declaredConstructors = Book.class.getDeclaredConstructors();
        for(Constructor constructor:declaredConstructors){
            Class[] parameterTypes = constructor.getParameterTypes();
            for(Class aClass:parameterTypes){
                System.out.println(aClass.getName());
            }
            System.out.println("-----------构造器分割符1----------");
        }
    }
}
