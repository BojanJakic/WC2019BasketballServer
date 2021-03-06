package wc2019.validation.annotation;

import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueGroupName {

    String message() default "Group name already exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
