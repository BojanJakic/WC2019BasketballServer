package wc2019.validation.annotation;

import wc2019.validation.validator.TeamsGroupSizeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TeamsGroupSizeValidator.class)
public @interface TeamsGroupSize {

    String message() default "Add exactly 4 teams";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
