package reflect.classtest;

import reflect.customize.annotation.BusinessNoAnnotation;
import reflect.po.BuyerPayment;

import java.lang.annotation.Annotation;

public class ClassTest {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName(BuyerPayment.class.getName());
            //获取类上的所用的注解
            Annotation[] annotations = aClass.getAnnotations();
            for(Annotation annotation:annotations){
                System.out.println("获取所有的注解:"+annotation.annotationType().getName());
            }
            //获取类上制定的注解
            BusinessNoAnnotation annotation = aClass.getAnnotation(BusinessNoAnnotation.class);
            if(annotation == null){
                System.out.println("获取指定的注解:"+annotation);
            }else {
                System.out.println("获取指定的注解:"+annotation.annotationType().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
