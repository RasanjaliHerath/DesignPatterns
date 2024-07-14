package DesignPatterns.templatemethod;

public class TemplatePattern {
    public static void main(String[] args) {
        MainDataProcess exobject = new ExcelFile();
        exobject.readProcessSave();  // Executes ExcelFile's readProcessSave() method

        System.out.println();

        MainDataProcess wordObject = new WordFile();
        wordObject.readProcessSave();  // Executes WordFile's readProcessSave() method

    }
}
