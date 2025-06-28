package com.basic.oops;

import java.util.HashMap;

public class PaymentService {
    HashMap<String,PaymentMethod> paymentMethods;

    PaymentService(){
        paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, PaymentMethod pm){
        paymentMethods.put(name,pm);
    }

    public void makePaymentMethod(String name){
        PaymentMethod pm = paymentMethods.get(name);
        pm.pay();
    }
}
