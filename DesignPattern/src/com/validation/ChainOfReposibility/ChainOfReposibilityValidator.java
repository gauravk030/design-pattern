package com.validation.ChainOfReposibility;

abstract class Validator {
    protected Validator next;

    public Validator linkWith(Validator next) {
        this.next = next;
        return next;
    }

    public abstract boolean validate(String input);
}

class NotEmptyValidator extends Validator {
    public boolean validate(String input) {
        if (input == null || input.isEmpty()) return false;
        return next == null || next.validate(input);
    }
}

class EmailFormatValidator extends Validator {
    public boolean validate(String input) {
        if (!input.contains("@")) return false;
        return next == null || next.validate(input);
    }
}

public class ChainOfReposibilityValidator {
    public static void main(String[] args) {
        String email1 = "";
        String email2 = "abc@";
        NotEmptyValidator notEmptyValidator = new NotEmptyValidator();
        Validator emailFormatValidator = new EmailFormatValidator();
        if(!notEmptyValidator.validate(email1)){
           if(!emailFormatValidator.validate(email1)) {
               System.out.println("Should be in proper format");
           }
        }else{
            System.out.println("Should not be empty");
        }

        if(!notEmptyValidator.validate(email2)){
            if(!emailFormatValidator.validate(email2)){
                System.out.println("Should be in proper format");
            }
        }else{
            System.out.println("Should not be empty");
        }
    }
}
