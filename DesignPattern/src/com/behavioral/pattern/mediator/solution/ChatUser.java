package com.behavioral.pattern.mediator.solution;

public class ChatUser {
    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name,ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public void sendMessage(String msg){
        System.out.println(this.name + " sending a msg " + msg);
        chatMediator.sendMessage(msg,this);
    }

    public String getName(){
        return name;
    }

    public void recieveMessage(String msg, ChatUser sender){
        System.out.println(this.name + " received message: '" + msg + "' from " + sender.getName());
    }
}
