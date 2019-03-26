package reflect.customize.annotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface BusinessNoAnnotation {
    public String businessNo() default "";

    public String desc() default  "";
}
