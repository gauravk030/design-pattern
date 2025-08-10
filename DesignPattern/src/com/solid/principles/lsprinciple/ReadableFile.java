package com.solid.principles.lsprinciple;

public class ReadableFile implements Readable  {

    @Override
    public void read() {
        System.out.println("Read file...");
    }
}
