package com.behavioral.pattern.mediator.solution;

interface ChatMediator{
    void sendMessage(String msg,ChatUser user);
    void addUser(ChatUser user);
}
