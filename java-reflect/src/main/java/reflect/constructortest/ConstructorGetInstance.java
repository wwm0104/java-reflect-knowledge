package reflect.constructortest;

import reflect.po.Book;

import java.lang.reflect.Constructor;

/**
 * 通过构造器反射对象
 */
public class ConstructorGetInstance {
    public static void main(String[] args) {
        try {
            Constructor<Book> declaredConstructor = Book.class.getDeclaredConstructor(new Class[]{String.class, String.class});
            Book book = declaredConstructor.newInstance("sss", "sss2");
            System.out.println(book.getName()+","+book.getAddress());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
