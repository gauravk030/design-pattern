package com.validation.java8;

import java.util.function.Predicate;

public class PredicateValidationExample {
    public static void main(String[] args) {
        User user = new User("", "invalid-email");

        Predicate<User> isNameValid = u -> u.name != null && !u.name.isEmpty();
        Predicate<User> isEmailValid = u -> u.email != null && u.email.contains("@");

        Predicate<User> isValid = isNameValid.and(isEmailValid);

        if (isValid.test(user)) {
            System.out.println("Validation passed.");
        } else {
            System.out.println("Validation failed.");
        }
    }
}
