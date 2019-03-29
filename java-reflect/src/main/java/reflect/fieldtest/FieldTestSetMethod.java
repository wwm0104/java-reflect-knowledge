package reflect.fieldtest;

import reflect.po.Book;

import java.lang.reflect.Field;

/**
 * 设置字段值
 * 1.如果是私有的字段，需要禁止Java语言检查
 */
public class FieldTestSetMethod {
    public static void main(String[] args) {
        Book book = new Book();
        try {
            Field name = Book.class.getDeclaredField("name");
            name.setAccessible(true);
            name.set(book,"test");
            System.out.println(book.getName());

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
