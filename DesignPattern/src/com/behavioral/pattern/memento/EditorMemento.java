package com.behavioral.pattern.memento;
/**
 *  
 components:
  Originator : the object whose state needs to be saved and restored
  Memento: Captures and stores the internal state of the originator
  Caretaker: Manages and stores the mementos, without modifying them
  
  
  Application
  1) Application needs histry management e.g. texteditorm, drawing app
  2) Application needs state restoration (periodicaaly save system state) e.g. games, data recovery (Allow users to return previous state)
  
  Use case
   I) Games: Saving the game state for load/reload functionality
   II) Document editors: Undo/Redo functionality to navigate through doc changes
   III) Graphics design app
   
 */
public class EditorMemento {
	private final String content;

	public EditorMemento(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
