package com.validation.java8.generic;

import java.util.function.Predicate;

public class RuleFactory {
    public static <T> ValidationRule<T> from(Predicate<T> predicate, String errorMessage) {
        return new ValidationRule<T>() {
            @Override
            public boolean test(T t) {
                return predicate.test(t);
            }

            @Override
            public String getErrorMessage() {
                return errorMessage;
            }
        };
    }
}