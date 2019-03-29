package reflect.classtest;

import reflect.po.Son;

/**
 * 获取实例对象
 */
public class ClassGetNewInstance {
    public static void main(String[] args) {
        try {
            Son son = Son.class.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
