package reflect.classtest;

import reflect.po.Son;

/**
 * 需要对ClassLoader在了解下
 */
public class ClassGetClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = Son.class.getClassLoader();
        System.out.println(classLoader.toString());
    }
}
