package com.solid.principles.diprinciple;

public class Client {
    public static void main(String[] args) {
        NotificationServices emailNotification = new NotificationServices(new EmailService());
        emailNotification.notify("Your order has been shipped...");

        NotificationServices smsNotification = new NotificationServices(new SMSService());
        smsNotification.notify("OTP 1234");
    }
}
