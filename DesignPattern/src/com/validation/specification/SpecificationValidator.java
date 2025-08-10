package com.validation.specification;
interface Specification<T> {
    boolean isSatisfiedBy(T t);
}

class EmailSpecification implements Specification<String> {
    public boolean isSatisfiedBy(String input) {
        return input.contains("@");
    }
}

class LengthSpecification implements Specification<String> {
    private int minLength;

    public LengthSpecification(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean isSatisfiedBy(String input) {
        return input != null && input.length() >= minLength;
    }
}

class AndSpecification<T> implements Specification<T> {
    private Specification<T> one, two;

    public AndSpecification(Specification<T> one, Specification<T> two) {
        this.one = one;
        this.two = two;
    }

    public boolean isSatisfiedBy(T t) {
        return one.isSatisfiedBy(t) && two.isSatisfiedBy(t);
    }
}

class UserEmailSpecification implements Specification<User> {
    private Specification<String> emailSpec;

    public UserEmailSpecification(Specification<String> emailSpec) {
        this.emailSpec = emailSpec;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return emailSpec.isSatisfiedBy(user.getEmail());
    }
}

public class SpecificationValidator {
    public static void main(String[] args) {
        // Rules for String
        Specification<String> emailRule = new EmailSpecification();
        Specification<String> lengthRule = new LengthSpecification(6);

        // Combine rules using AND
        Specification<String> combinedSpec = new AndSpecification<>(emailRule, lengthRule);

        // Apply to User
        Specification<User> userEmailSpec = new UserEmailSpecification(combinedSpec);

        // Test users
        User user1 = new User(null,"john@example.com");
        User user2 = new User(null,"bad");

        System.out.println("User 1 valid? " + userEmailSpec.isSatisfiedBy(user1)); // true
        System.out.println("User 2 valid? " + userEmailSpec.isSatisfiedBy(user2)); // false
    }
}
