package com.behavioral.pattern.memento;

/**
 * A text editor where the user can undo changes, such as text addition, deletion,
 * or formatting. The editor stores snapshots of its state (text content)
 * after each change, enabling the user to revert to previous states.
 */

/**
 *  Problem : How to provide undo/redo functionality or state restoration without
 *  exposing the objects internal state and breaking encapsulation
 *  
 *  Solution: The memento pattern captures the internal state of an object in memento
 *  allowing the object to restore its state later on without revealing internal details
 */
 
public class TextEditor {
	private String content;
   
	public void write(String text){
        this.content = text;
    }
    //Save the current state of editor
    public EditorMemento save(){
        return new EditorMemento(content);
    }

    //Restore (Memento->update the state of current content)
    public void restore(EditorMemento memento){
        content = memento.getContent();
    }

    public String getContent(){
        return content;
    }
}
