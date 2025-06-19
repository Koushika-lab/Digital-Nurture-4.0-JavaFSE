
public class PdfFactory extends DocumentFactory {
    @Override public Document createDocument() {
        System.out.println("PdfFactory: creating PdfDocument");
        return new PdfDocument();
    }
}
