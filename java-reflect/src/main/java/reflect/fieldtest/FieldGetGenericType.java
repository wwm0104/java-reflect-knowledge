package reflect.fieldtest;

import reflect.po.Book;

import java.lang.reflect.Field;

/**
 * 获取字段所属的类型
 * getGenericType 没有擦出泛型
 * getType 擦出了泛型
 */
public class FieldGetGenericType {

    public static void main(String[] args) {
        Field[] declaredFields = Book.class.getDeclaredFields();
        for(Field field:declaredFields){
            System.out.println("获取字段所属的类型:"+field.getGenericType().getTypeName());
            System.out.println("获取字段所属的类型2:"+field.getType().getName());
        }
    }
}
