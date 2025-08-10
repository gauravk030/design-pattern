package com.behavioral.pattern.command;

public class ChangeColor implements Command{
    private TextEditorII editor;

    public ChangeColor(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.changeColor();
    }
}
