public class PdfDocument implements Document {
    public PdfDocument() { System.out.println("PdfDocument created"); }
    @Override public void open() { System.out.println("Opening PDF document..."); }
}
