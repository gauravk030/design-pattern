package com.solid.principles.diprinciple;

/**
 * Dependency Inversion Principle: High level module should not be depends on low-level
 * modules; should depend on abstraction
 */
public class NotificationServices {
   /* private EmailService emailService;
    private SMSService smsService;

    public NotificationServices() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }*/

    /* Problem:
       1. This makes tightly coupled because if we change mail service we will have to change
       notification service too.
       2. In-future we will add whatsapp service then also we will have to change notification class
       Solution:
       Using abstraction we reduced the tight coupling
     */
   /* public void notifyByMail(String msg){
        this.emailService.sendMail(msg);
    }

    public void notifyBySms(String msg){
        this.smsService.sendSms(msg);
    }*/

    private NotificationChannels notificationChannels;

    public NotificationServices(NotificationChannels notificationChannels){
        this.notificationChannels = notificationChannels;
    }

    public void notify(String msg){
        this.notificationChannels.send(msg);
    }
}
