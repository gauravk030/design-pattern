package com.behavioral.pattern.templatemethod;

public class WithTemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParserII();
        DataParser jsonParser = new JSONParserII();
        csvParser.parse();
        jsonParser.parse();
    }
}
