package com.validation.strategy;

interface Validator {
    boolean isValid(String input);
}

class EmailValidator implements Validator {
    public boolean isValid(String input) {
        return input.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }
}

class PhoneValidator implements Validator {
    public boolean isValid(String input) {
        return input.matches("\\d{10}");
    }
}

public class StrategyValidatorExample {
    public static void main(String[] args) {
        Validator phoneValidator = new PhoneValidator();
        if(!phoneValidator.isValid("91000018558989")){
            System.out.println("Phone number is incorrect");
        }

        Validator emailValidator  = new EmailValidator();
        if(!emailValidator.isValid("test@")){
            System.out.println("Email id is invalid");
        }
    }
}
