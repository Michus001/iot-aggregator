package com.cleverlance.academy.aggregator.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = GenderValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD})
public @interface Gender {
    
    String message() default "Invalid gender value";
    
    Class<?>[] groups() default {};
    
    Class<? extends Payload>[] payload() default {};
}
