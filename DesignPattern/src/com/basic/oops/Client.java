package com.basic.oops;

public class Client {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();
        service.addPaymentMethod("GK debit card",new DebitCard("ICICI debit Card",122332323));
        service.makePaymentMethod("GK debit card");

        service.addPaymentMethod("GK crebit card",new DebitCard("HDFC credit Card",122332323));
        service.makePaymentMethod("GK crebit card");

        service.addPaymentMethod("GK UPI",new UPI("gkk@upi.com"));
        service.makePaymentMethod("GK UPI");
    }
}
