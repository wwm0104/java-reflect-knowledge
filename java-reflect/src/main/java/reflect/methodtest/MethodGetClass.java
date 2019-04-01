package reflect.methodtest;

import reflect.po.Book;

import java.lang.reflect.Method;

/**
 * 获取方法所属的类名称
 * 1.getDeclaringClass 获取该方法是哪个类的
 */
public class MethodGetClass {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName(Book.class.getName());
            Method setName = aClass.getDeclaredMethod("setName", new Class[]{String.class});
            System.out.println("获取所属的类名称:"+setName.getDeclaringClass().getName());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
