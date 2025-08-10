package com.validation.java8.generic;

public interface ValidationRule<T> {
    boolean test(T t); // like Predicate<T>
    String getErrorMessage();
}
