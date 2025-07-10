package com.solid.principles.lsprinciple;

public class Client {
    public static void readAnyFile(ReadableFile readableFile){
        readableFile.read();
    }

    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();
        //readableFile.wrte(); // not supported
        readAnyFile(readableFile);

        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();

        readAnyFile(writableFile);
    }
}
