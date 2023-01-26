package Övning_1b_BasicStrömmarMap;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();

        listOfBooks.stream().map(Book::getTitel).forEach(book -> System.out.println(book));
        System.out.println();
        listOfBooks.stream().map(Book::getFörfattare).distinct().forEach(book -> System.out.println(book));
        System.out.println();
        listOfBooks.stream().filter(book -> book.getÄgare().equals("Luma bibliotek")).map(Book::getTitel).forEach(book -> System.out.println(book));
    }
}
/*
Uppgift 1b– Basic strömmar, map
Jobba vidare med din bok-lista.
Skriv följande funktioner som alla ska använda lambda-metoden map:
• En funktion som returnerar en lista på alla titlar som dina böcker har
• En funktion som returnerar en lista på alla författare som dina böcker har
o Vi vill inte ha några dubletter i listan
• En funktion som listar alla titlar, men bara på böcker som tillhör dig
 */
