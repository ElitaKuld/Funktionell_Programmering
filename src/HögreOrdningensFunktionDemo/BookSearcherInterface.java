package HögreOrdningensFunktionDemo;

@FunctionalInterface
public interface BookSearcherInterface {
    boolean search (Book book, String wordToSearch);
}
