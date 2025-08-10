package com.solid.principles.lsprinciple;

public class WritableFile extends ReadableFile implements Writable{

    @Override
    public void write() {
        System.out.println("Write file...");
    }
}
