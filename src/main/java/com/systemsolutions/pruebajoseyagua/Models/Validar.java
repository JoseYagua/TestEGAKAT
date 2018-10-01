package com.systemsolutions.pruebajoseyagua.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class Validar implements Validator{
   
    @Override
    public boolean supports(Class<?> type) 
    {
        return table2.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
         ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Vtable1.a",
        "required.Vtable1.a", "El campo a es Obligatorio.");
    }
}
