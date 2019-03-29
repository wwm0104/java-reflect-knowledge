package reflect.fieldtest;

import reflect.po.Book;

import java.lang.reflect.Field;

/**
 * 获取该字段是属于哪个类的
 */
public class FieldTestGetClass {
    public static void main(String[] args) {
        Field[] declaredFields = Book.class.getDeclaredFields();
        for(Field field:declaredFields){
            Class<?> declaringClass = field.getDeclaringClass();
            System.out.println("字段:"+field.getName()+"所属的类:"+declaringClass.getName());
        }
    }
}
