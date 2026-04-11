package com.ead.authuser.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordConstraintImpl.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {

    String message() default """
                                Invalid password! Password must contain at least one digit [0-9], at least one lowercase Latin charactere [a-z], 
                                at least one uppercase Latin character [A-Z], at least one special character like !@#&()-:;'?/*~$^+=<>, 
                                a length of at least 6 characteres and a maximum of 20 characteres.
                            """;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
