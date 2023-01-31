package Övning_1f_BasicStrömmar_Sortering;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();
        Collator collator = Collator.getInstance(new Locale("sv", "SE"));

        listOfBooks.stream().sorted((b1, b2) -> ((Integer) b1.getBetyg()).compareTo(b2.getBetyg())).forEach(b -> System.out.println(b.getBetyg()));
        System.out.println();
        listOfBooks.stream().sorted((b1, b2) -> ((Integer) b1.getBetyg()).compareTo(b2.getBetyg())).forEach(b -> System.out.println(b.getTitel())); // skriva ut titlar i betygsordning
        System.out.println();
        listOfBooks.stream().map(Book::getBetyg).sorted().forEach(System.out::println); // ett enklare sätt att göra samma sak

        System.out.println();
        listOfBooks.stream().map(Book::getTitel).sorted(collator).forEach(System.out::println);
        System.out.println();
        List<Book> sorted = listOfBooks.stream().sorted(Comparator.comparing(book -> book.getFörfattare().split(" ")[1], collator)). // Sigruns variant
                collect(Collectors.toList());                                                                            // sorterar författare by efternamn!!!!
        sorted.forEach(book -> System.out.println(book.getFörfattare()));

    }
}
/*
Uppgift 1f– Basic strömmar, sortering
Skriv följande funktioner som alla ska använda sig av sortering:
• En funktion som skriver ut böckerna i rating-ordning
• En funktion som skriver ut titlarna i (svensk) bokstavsordning
 */
