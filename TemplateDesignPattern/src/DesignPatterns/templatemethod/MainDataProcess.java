package DesignPatterns.templatemethod;

public abstract class MainDataProcess {

    // Template method
    public void readProcessSave(){
        readData(); // Step 1: Read data
        processData();  // Step 2: Process data
        SaveData(); // Step 3: Save data to database
    }

    // Abstract methods to be implemented by subclasses
    public abstract void readData();
    public abstract void processData();

    // Concrete method with default implementation
    public void SaveData(){
        System.out.println("Save Data To DB");
    }
}


