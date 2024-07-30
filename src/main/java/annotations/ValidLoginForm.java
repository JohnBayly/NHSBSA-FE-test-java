package annotations;

import validators.LoginFormValidator;

//import javax.validation.Constraint;
//import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Constraint(validatedBy = LoginFormValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidLoginForm {

    String message() default "Invalid";

    Class<?>[] groups() default {};

//    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface List {

        ValidLoginForm[] value();
    }
}
