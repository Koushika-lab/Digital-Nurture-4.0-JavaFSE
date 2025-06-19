package Code;

public class TestFactory {
    public static void main(String[] args) {
        DocumentFactory factory;
        Document doc;

        factory = new WordFactory();
        doc = factory.createDocument();
        doc.open();
        System.out.println();

        factory = new PdfFactory();
        doc = factory.createDocument();
        doc.open();
        System.out.println();

        factory = new ExcelFactory();
        doc = factory.createDocument();
        doc.open();
    }
}
