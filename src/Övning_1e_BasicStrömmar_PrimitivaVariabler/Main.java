package Övning_1e_BasicStrömmar_PrimitivaVariabler;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();

        System.out.println(listOfBooks.stream().map(Book::getBetyg).mapToInt(i -> i).average().getAsDouble());
        System.out.println(listOfBooks.stream().mapToDouble(book -> book.getBetyg()).sum() / listOfBooks.size()); // Sigruns variant
        System.out.println(listOfBooks.stream().mapToInt(book -> book.getBetyg()).summaryStatistics().getAverage()); // Sigruns variant

        System.out.println(listOfBooks.stream().filter(book -> book.getÄgare().equals("Luma bibliotek")).
                filter(book -> book.getFärg().equals("grön")).count());

        System.out.println(listOfBooks.stream().map(Book::getFörfattare).filter(författare -> författare.equals("Tim Ferriss")).
                findAny().orElse("No such book"));
        System.out.println(listOfBooks.stream().map(Book::getFörfattare).filter(författare -> författare.equals("Eva Mejer")).
                findAny().orElse("No such book"));
        System.out.println(listOfBooks.stream().filter(book -> book.getFörfattare().equals("Eva Mejer")).
                findAny().get().getTitel());                                                                                      // WOW!!!!!!!!!

        System.out.println(listOfBooks.stream().map(Book::getFörfattare).anyMatch(författare -> författare.equals("Eva Mejer")));
        System.out.println(listOfBooks.stream().anyMatch(book -> book.getFörfattare().equals("Eva Mejer")));

    }
}
/*
Uppgift 1e– Basic strömmar, primitiva variabler, anymatch
Skriv följande funktioner som alla ska använda sig av primitiva variabler eller anymatch:
• En funktion som räknar ut medelvärdet av dina betyg
• En funktion som räknar antalet böcker i listan som tillhör dig OCH är röda (välj nån färg och
ägare som du får träffar på)
• Skriv en funktion som ger sant om det finns några böcker av Tim Ferriss (eller annan valfri
författare) i din lista.
 */
