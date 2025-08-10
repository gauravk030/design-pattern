package com.behavioral.pattern.command;

public class Button{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void click(){
        command.execute();
    }
}