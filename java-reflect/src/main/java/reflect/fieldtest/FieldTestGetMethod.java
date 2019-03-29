package reflect.fieldtest;

import reflect.po.Book;

import java.lang.reflect.Field;

/**
 * get 方法
 * 1.如果时候私有的字段需要放开java语言检查
 */
public class FieldTestGetMethod {
    public static void main(String[] args) {
        Book book = new Book();
        try {
            //获取该类的所有的字段
            Field[] declaredFields = Book.class.getDeclaredFields();
            for(Field field:declaredFields){
                field.setAccessible(true);//是否禁止java语言检查,true 禁止Java语言检查,false,需要Java语言检查
                System.out.println("字段名称:"+field.getName()+",字段值:"+field.get(book));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
