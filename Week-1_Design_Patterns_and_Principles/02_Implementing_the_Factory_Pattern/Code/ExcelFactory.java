package Code;
public class ExcelFactory extends DocumentFactory {
    @Override public Document createDocument() {
        System.out.println("ExcelFactory: creating ExcelDocument");
        return new ExcelDocument();
    }
}
