package com.behavioral.pattern.command;

public class BoldCommand implements Command{
    private TextEditorII editor;

    public BoldCommand(TextEditorII editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.boldText();
    }
}
