package com.solid.principles.isprinciple;

public class MultiPuposePrinter implements Printer,Scanner,Copier{
    @Override
    public void print(Document doc) {
        System.out.println("Print document");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scan document");
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Copy document");
    }
}
