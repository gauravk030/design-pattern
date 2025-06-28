package com.solid.srprinciple;

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

    /* No trelted to invoice reposnsibility
      Problem - We provide multiple reponsibility to invoice class
      soltuion to create multiple class has single responsibilty
      */

//    public void saveInDatabase(){
//        System.out.println("Save into db");
//    }
//    public void sendNotification(){
//        System.out.println("Send notification of generated invoice");
//    }
}
