package com.behavioral.pattern.command;

public class WithCommandPattern {
    public static void main(String[] args) {
        TextEditorII editorII = new TextEditorII();

        //Button
        // Decoupling -> One button can do many types of actions, decoupled from the text editor!
        Button button = new Button();
        button.setCommand(new BoldCommand(editorII));
        button.setCommand(new ChangeColor(editorII));
        button.click();
    }
}