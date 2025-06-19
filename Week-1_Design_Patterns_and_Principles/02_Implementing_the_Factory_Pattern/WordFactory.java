public class WordFactory extends DocumentFactory {
    @Override public Document createDocument() {
        System.out.println("WordFactory: creating WordDocument");
        return new WordDocument();
    }
}
