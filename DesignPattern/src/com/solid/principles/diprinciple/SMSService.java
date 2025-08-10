package com.solid.principles.diprinciple;

public class SMSService implements NotificationChannels {
//    public void sendSms(String msg){
//        System.out.println("SMS sending with message "+ msg);
//    }
    public void send(String msg){
        System.out.println("SMS sending with message "+ msg);
    }
}
