package com.solid.principles.srprinciple;

/**
 * Single Reponsibility Principle - only one reason to change
 */
public class Invoice {
    private double amount;

    Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Generate invoice of amount "+amount);
    }

    /* No related to invoice responsibility
      Problem - We provide multiple responsibility to invoice class
      solution - to create multiple class has single responsibility
      */

//    public void saveInDatabase(){
//        System.out.println("Save into db");
//    }
//    public void sendNotification(){
//        System.out.println("Send notification of generated invoice");
//    }
}
