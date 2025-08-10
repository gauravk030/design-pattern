package com.behavioral.pattern.templatemethod;

/**
 * Problems are:
 * 1. Duplicate code in each parser
 * 2. Same steps we have to follow in each parser
 */

//CSV Parser
class CSVParser{
    public void parse(){
        openFile(); //same steps
        //CSV Specific Parsing Logic
        System.out.println("Parsing a CSV File");
        closeFile();
    }
    // Duplicate code
    private void openFile(){
        System.out.println("Opening File");
    }
    private void closeFile(){
        System.out.println("Closing File");
    }
}

class JSONParser{
    public void parse(){
        openFile();
        //CSV Specific Parsing Logic
        System.out.println("Parsing a JSON File");
        closeFile();
    }
    private void openFile(){
        System.out.println("Opening File");
    }
    private void closeFile(){
        System.out.println("Closing File");
    }
}


public class WithoutTemplateMethod {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        csvParser.parse();
        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();
    }
}