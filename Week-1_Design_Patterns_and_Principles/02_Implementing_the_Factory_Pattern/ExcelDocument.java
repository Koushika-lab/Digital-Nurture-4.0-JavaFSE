
public class ExcelDocument implements Document {
    public ExcelDocument() { System.out.println("ExcelDocument created"); }
    @Override public void open() { System.out.println("Opening Excel spreadsheet..."); }
}