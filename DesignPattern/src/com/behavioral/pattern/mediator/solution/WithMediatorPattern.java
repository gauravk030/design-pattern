package com.behavioral.pattern.mediator.solution;

public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser rahul = new ChatUser("Rahul",chatRoom);
        ChatUser amit = new ChatUser("Amit",chatRoom);
        ChatUser neha = new ChatUser("Neha",chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(neha);
        chatRoom.addUser(amit);

        amit.sendMessage("Hi everyone");
    }
}
