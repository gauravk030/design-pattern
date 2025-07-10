package com.solid.principles.isprinciple;

/**
 * Interface segregation principle - makesure classes are not burdened with methods
 * they don't need. they need better design to break large interface into smaller,
 * more specific one
 */

/*
    problem - Here basic printer provide only print functionality, but we provide un-necessary
    to burdened to printer class
 */

//public class SimplePrinter implements Machine{
//
//    @Override
//    public void print(Document doc) {
//        System.out.println("Print document");
//    }
//
//    @Override
//    public void scan(Document doc) {
//        System.out.println("Scan document");
//    }
//
//    @Override
//    public void copy(Document doc) {
//        System.out.println("Copy document");
//    }
//}

// Solution
public class SimplePrinter implements Printer{
    @Override
    public void print(Document doc) {
        System.out.println("Print document");
    }
}