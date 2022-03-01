package com.cleverlance.academy.aggregator.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<Gender, String> {
    
    private static final String MALE_VALUE = "MALE";
    private static final String FEMALE_VALUE = "FEMALE";
    
    @Override
    public void initialize(Gender constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return MALE_VALUE.equals(value) || FEMALE_VALUE.equals(value);
    }
}
