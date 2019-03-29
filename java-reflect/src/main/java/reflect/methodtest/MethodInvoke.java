package reflect.methodtest;

import reflect.po.Book;

import java.lang.reflect.Method;

/**
 * 执行方法
 * 1.返回参数
 * 2.获取参数
 * 3.获取参数类型等
 */
public class MethodInvoke {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName(Book.class.getName());
            Object o = aClass.newInstance();
            Method setName = aClass.getDeclaredMethod("setName", new Class[]{String.class});
            setName.invoke(o, "test");
            //get方法没有入参所以直接返回空的
            Method getName = aClass.getDeclaredMethod("getName",null);
            Object invoke = getName.invoke(o, null);
            System.out.println(invoke.toString());
        }catch ( Exception e){
            e.printStackTrace();
        }

    }
}
