package com.validation.java8.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericValidator<T> {

    private final List<ValidationRule<T>> rules = new ArrayList<>();

    public GenericValidator<T> addRule(ValidationRule<T> rule) {
        rules.add(rule);
        return this;
    }

    public List<String> validate(T object) {
        List<String> errors = new ArrayList<>();
        for (ValidationRule<T> rule : rules) {
            if (!rule.test(object)) {
                errors.add(rule.getErrorMessage());
            }
        }
        return errors;
    }
}
