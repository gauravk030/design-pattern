package com.solid.principles.srprinciple;

public class Client {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000);
        invoice.generateInvoice();

        InvoiceRepository repo = new InvoiceRepository();
        repo.saveInDatabase();

        NotificationService service = new NotificationService();
        service.sendNotification();
    }
}
