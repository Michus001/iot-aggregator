package com.cleverlance.academy.aggregator.model;

import com.cleverlance.academy.aggregator.validation.Gender;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import lombok.Data;
import lombok.Value;

@Embeddable
@Data
public class Person {
    @Column(name = "first_name")
    @NotBlank
    private String firstName;
    @Column(name = "last_name")
    @NotBlank
    private String lastName;
    
    @Email
    @Column(name = "mail")
    @NotBlank
    private String mail;
    
    @Gender
    @Column(name = "gender")
    private String gender;
}
