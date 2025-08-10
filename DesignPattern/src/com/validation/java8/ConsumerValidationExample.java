package com.validation.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerValidationExample {
    public static void main(String[] args) {
        User user = new User("", "invalid-email");
        List<String> errors = new ArrayList<>();

        List<Consumer<User>> validators = List.of(
                u -> { if (u.name == null || u.name.isEmpty()) errors.add("Name is required"); },
                u -> { if (u.email == null || !u.email.contains("@")) errors.add("Invalid email"); }
        );

        validators.forEach(v -> v.accept(user));


        if (errors.isEmpty()) {
            System.out.println("Validation passed.");
        } else {
            System.out.println("Validation failed: " + errors);
        }
    }
}
