package com.wyat.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.wyat.service.dto.UserDTO;

public class UserValidator implements Validator {

    @Override
    public boolean supports(final Class<?> clazz) {
        return UserDTO.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(final Object obj, final Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "message.name", "User Name is required.");
     //   ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "message.gender", "Gender is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "message.password", "Password is required.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNuber", "message.phoneNuber", "Phone Number is required.");
    }

}
