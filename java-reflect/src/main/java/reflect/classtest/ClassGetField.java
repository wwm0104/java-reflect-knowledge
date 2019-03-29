package reflect.classtest;

import reflect.po.Son;

import java.lang.reflect.Field;

/**
 * 获取字段
 *getFields 获取所有的public字段,包含继承而来的
 *getDeclared 获取该类所有的字段,包含私有
 */
public class ClassGetField {
    public static void main(String[] args) {
        try {
            Field[] fields = Son.class.getFields();
            for(Field field:fields){
                System.out.println("获取所有的public字段,包含继承而来的:"+field.getName());
            }
            System.out.println("--------------------");
            Field sonAge = Son.class.getField("sonAge");
            System.out.println("获取特定字段:"+sonAge.getName());
            System.out.println("--------------------");
            Field[] declaredFields = Son.class.getDeclaredFields();
            for(Field field:declaredFields){
                System.out.println("获取该类所有的字段,包含私有:"+field.getName());
            }
            System.out.println("--------------------");
            Field sonAddress = Son.class.getDeclaredField("sonAddress");
            System.out.println("获取特定字段:"+sonAddress.getName());
            System.out.println("--------------------");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
