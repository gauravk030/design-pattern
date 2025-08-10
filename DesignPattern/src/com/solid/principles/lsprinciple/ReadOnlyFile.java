package com.solid.principles.lsprinciple;

/**
 * Liskov Substitution Principle: State that objects of superclass should not replaceable
 * with objects of subclass without altering the correctness of program
 * Ensure that the subclass stand in for its parent class and function correctly in context
 * that expects the parent class
 */
public class ReadOnlyFile extends ReadableFile {//File {

    /*
    Problem : It violet the principle because read only file not support write functionality
    Solution: Split interface into smaller one
    */
 //   @Override
//    public void write() {
//        throw new IllegalArgumentException("Opertion not supported");
//    }
}
