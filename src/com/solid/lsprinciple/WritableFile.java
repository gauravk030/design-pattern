package com.solid.lsprinciple;

public class WritableFile extends ReadableFile implements Writable{

    @Override
    public void write() {
        System.out.println("Write file...");
    }
}
