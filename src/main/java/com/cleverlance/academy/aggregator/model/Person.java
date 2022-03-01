package com.cleverlance.academy.aggregator.model;

import com.cleverlance.academy.aggregator.validation.Gender;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import lombok.Value;

@Value
public class Person {
    private String firstName;
    private String lastName;
    
    @Email
    private String mail;
    
    @Gender
    private String gender;
}
