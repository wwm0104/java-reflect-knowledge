package reflect.fieldtest;

import reflect.customize.annotation.BusinessNoAnnotation;
import reflect.po.Book;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

/**
 * 获取字段上的注解
 *
 */
public class FieldTestGetAnnotation {
    public static void main(String[] args) {
        Field[] declaredFields = Book.class.getDeclaredFields();
        for(Field field:declaredFields){
            BusinessNoAnnotation annotation = field.getAnnotation(BusinessNoAnnotation.class);
            if(annotation != null){
                System.out.println(annotation.businessNo()+","+annotation.desc());
            }

            AnnotatedType annotatedType = field.getAnnotatedType();
            if(annotatedType != null){
                System.out.println(annotatedType.toString());
            }

            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            if(declaredAnnotations != null){
                System.out.println(declaredAnnotations.toString());
            }
        }
    }
}
