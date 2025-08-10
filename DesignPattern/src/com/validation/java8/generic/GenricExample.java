package com.validation.java8.generic;

import java.util.List;

public class GenricExample {
    public static void main(String[] args) {
        User user = new User("", "bad-email");

        GenericValidator<User> validator = new GenericValidator<User>()
                .addRule(RuleFactory.from(u -> u.name != null && !u.name.trim().isEmpty(), "Name is required"))
                .addRule(RuleFactory.from(u -> u.email != null && u.email.contains("@"), "Invalid email format"));

        List<String> errors = validator.validate(user);

        if (errors.isEmpty()) {
            System.out.println("Validation passed");
        } else {
            System.out.println("Validation failed: " + errors);
        }
    }
}
