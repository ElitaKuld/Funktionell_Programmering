package HögreOrdningensFunktionDemo;

import java.util.List;
import java.util.Scanner;

public class Main {
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
    }
}