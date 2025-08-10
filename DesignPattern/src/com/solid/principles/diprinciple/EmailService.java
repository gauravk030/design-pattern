package com.solid.principles.diprinciple;

public class EmailService implements NotificationChannels{

//    public void sendMail(String msg){
//        System.out.println("Email sending with message "+ msg);
//    }

    public void send(String msg){
        System.out.println("Email sending with message "+ msg);
    }
}
