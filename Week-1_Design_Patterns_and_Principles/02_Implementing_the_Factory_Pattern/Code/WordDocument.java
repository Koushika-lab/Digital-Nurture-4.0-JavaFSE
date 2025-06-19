package Code;
public class WordDocument implements Document {
    public WordDocument() { System.out.println("WordDocument created"); }
    @Override public void open() { System.out.println("Opening Word document..."); }
}


