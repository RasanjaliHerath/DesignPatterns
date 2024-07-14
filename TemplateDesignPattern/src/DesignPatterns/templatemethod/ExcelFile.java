package DesignPatterns.templatemethod;

public class ExcelFile extends MainDataProcess {

    public void readData() {
        System.out.println("Read Data From - ExcelFile");
    }

    public void processData() {
        System.out.println("Process Daata from -ExcelFile");
    }

}
