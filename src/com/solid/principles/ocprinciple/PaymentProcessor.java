package com.solid.principles.ocprinciple;

/**
 * Open / Close principle - open for extension and closed for modification
 * Adding new function by adding inheritance and composition without modifying existing code
 */
public class PaymentProcessor {

     /*  Problem - if we add new payment method in future then
//       we break principle by modifying existing functionality */
//    public void paymentProcess(String paymentMethod,double amount){
//        if(paymentMethod.equals("debit")){
//            System.out.println("Payment processed via debit card with amount "+amount);
//        }else if(paymentMethod.equals("credit")){
//            System.out.println("Payment processed via credit card with amount "+amount);
//        }else if(paymentMethod.equals("upi")){
//            System.out.println("Payment processed via upi with amount "+amount);
//        }else{
//            throw new IllegalArgumentException("Payment method not supported");
//        }
//    }

    public void paymentProcess(PaymentMethod pm){
        pm.pay();
    }
}
