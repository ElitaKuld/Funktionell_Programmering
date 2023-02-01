package HögreOrdningensFunktionDemo;

import java.util.List;
import java.util.Scanner;

public class Main {

    final List<Book> listOfBooks = BookUtil.getBookList();

    BookSearcherInterface titelSök = (book, string) -> book.getTitel().equalsIgnoreCase(string);
    BookSearcherInterface författareSök = (book, string) -> book.getFörfattare().equalsIgnoreCase(string);
    BookSearcherInterface genreSök = (book, string) -> book.getGenre().equalsIgnoreCase(string);
    BookSearcherInterface färgSök = (book, string) -> book.getFärg().equalsIgnoreCase(string);
    BookSearcherInterface ägareSök = (book, string) -> book.getÄgare().equalsIgnoreCase(string);


    // Högre ordningens funktion
    public void searchForBook(String ordAttLetaEfter, BookSearcherInterface bsi){
        listOfBooks.stream().filter(book -> bsi.search(book,ordAttLetaEfter)).
                forEach(book -> System.out.println(book.getTitel() + " " + book.getFörfattare() + " " + book.getÄgare()));
    }


    public static void main(String[] args) {

        Main main = new Main();

        final Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Vilken attribut vill du söka på?");
            String attributAttLetaEfter = scanner.nextLine();
            System.out.println("Vilket ord vill du leta efter");
            String ordAttLetaEfter = scanner.nextLine();

            if (attributAttLetaEfter.equalsIgnoreCase("titel")){
                main.searchForBook(ordAttLetaEfter, main.titelSök);

            }
            else if (attributAttLetaEfter.equalsIgnoreCase("författare")){
                main.searchForBook(ordAttLetaEfter, main.författareSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("genre")){
                main.searchForBook(ordAttLetaEfter, main.genreSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("färg")){
                main.searchForBook(ordAttLetaEfter, main.färgSök);
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("ägare")){
                main.searchForBook(ordAttLetaEfter, main.ägareSök);
            }
        }
    }


    /* Utan högre ordningens funktion:
    public static void main(String[] args) {

        final List<Book> listOfBooks = BookUtil.getBookList();
        final Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Vilken attribut vill du söka på?");
            String attributAttLetaEfter = scanner.nextLine();
            System.out.println("Vilket ord vill du leta efter");
            String ordAttLetaEfter = scanner.nextLine();

            if (attributAttLetaEfter.equalsIgnoreCase("titel")){
                listOfBooks.stream().filter(book -> book.getTitel().equalsIgnoreCase(ordAttLetaEfter)).
                        forEach(book -> System.out.println(book.getTitel() + " " + book.getFörfattare() + " " + book.getÄgare()));
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("författare")){
                listOfBooks.stream().filter(book -> book.getFörfattare().equalsIgnoreCase(ordAttLetaEfter)).
                        forEach(book -> System.out.println(book.getTitel() + " " + book.getFörfattare() + " " + book.getÄgare()));
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("genre")){
                listOfBooks.stream().filter(book -> book.getGenre().equalsIgnoreCase(ordAttLetaEfter)).
                        forEach(book -> System.out.println(book.getTitel() + " " + book.getFörfattare() + " " + book.getGenre()));
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("färg")){
                listOfBooks.stream().filter(book -> book.getFärg().equalsIgnoreCase(ordAttLetaEfter)).
                        forEach(book -> System.out.println(book.getTitel() + " " + book.getFörfattare() + " " + book.getFärg()));
            }
            else if (attributAttLetaEfter.equalsIgnoreCase("ägare")){
                listOfBooks.stream().filter(book -> book.getÄgare().equalsIgnoreCase(ordAttLetaEfter)).
                        forEach(book -> System.out.println(book.getTitel() + " " + book.getFörfattare() + " " + book.getÄgare()));
            }
        }
    }*/
}