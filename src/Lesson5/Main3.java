package Lesson5;

abstract class DataProcessor {
    public final void process() { // Template method
        readData();
        processData();
        saveData();
    }

    abstract void readData();     // Subclasses override
    abstract void processData();  // Subclasses override

    public void saveData() {
        System.out.println("Saving data...");
    }
}

class CSVDataProcessor extends DataProcessor {
    void readData() { System.out.println("Reading CSV data"); }
    void processData() { System.out.println("Processing CSV data"); }
}

class XMLDataProcessor extends DataProcessor {
    void readData() { System.out.println("Reading XML data"); }
    void processData() { System.out.println("Processing XML data"); }
}

public class Main3 {
    public static void main(String[] args) {
        DataProcessor processor = new CSVDataProcessor();  // Polymorphism
        processor.process(); // Calls CSV-specific versions

        processor = new XMLDataProcessor(); // Polymorphism again
        processor.process(); // Calls XML-specific versions
    }
}
