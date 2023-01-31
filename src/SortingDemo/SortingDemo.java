package SortingDemo;

import Övning_1a_BasicStrömmarFilter.Book;
import Övning_1a_BasicStrömmarFilter.BookUtil;

import java.text.Collator;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class SortingDemo {
    public static void main(String[] args) {
        List<String> namnLista = List.of("Anna", "Maria", "Alexander", "Andrey", "Elena", "Kristopher", "Catherine");
        List<String> namnListaKrånglig = List.of("anna", "Maria", "Alexander", "andrey", "Åke", "Elena", "Kristopher", "Catherine", "Öland", "Ära", "wednesday");
        List<Integer> siffraLista = List.of(1, 99, 256, 28, 299, 1586, 23, 14562, -457, -853, 12, 55, 28, -77);
        Collator collator = Collator.getInstance(new Locale("sv","SE"));
        List<Book> listOfBooks = BookUtil.getBookList();

        siffraLista.stream().sorted().forEach(System.out::println); // nytt sätt att skriva ut
        siffraLista.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        namnLista.stream().sorted().forEach(System.out::println);
        System.out.println();
        namnListaKrånglig.stream().sorted(collator).forEach(System.out::println);

        System.out.println();
        listOfBooks.stream().sorted((b1,b2) -> ((Integer)b1.getBetyg()).compareTo(b2.getBetyg())).forEach(b -> System.out.println(b.getBetyg()));
        System.out.println();
        listOfBooks.stream().sorted((b1,b2) -> ((Integer)b1.getBetyg()).compareTo(b2.getBetyg())).forEach(b -> System.out.println(b.getTitel())); // skriva ut titlar i betygsordning
        System.out.println();
        listOfBooks.stream().map(Book::getBetyg).sorted().forEach(System.out::println); // ett enklare sätt att göra samma sak
    }
}
