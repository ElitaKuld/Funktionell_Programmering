package Övning_1b_BasicStrömmarMap;

import java.util.List;

public class BookUtil {

    public static List<Book> getBookList() {
        Book book = new Book("Djurens språk", "Eva Mejer", "Djur och natur", "svart", 5, "Luma bibliotek", true);
        Book book1 = new Book("Fåglarnas hus", "Eva Mejer", "Djur och natur", "blå", 5, "Björkhagens bibliotek", true);
        Book book2 = new Book("Trädens hemliga liv", "Peter Wohlleben", "Natur", "grön", 5, "Luma bibliotek", true);
        Book book3 = new Book("Djurens hemliga liv", "Peter Wohlleben", "Djur och natur", "grön", 5, "Luma bibliotek", true);
        Book book4 = new Book("The power of now", "Eckhart Tolle", "Spiritual journey", "blå", 5, "Högdalens bibliotek", false);
        Book book5 = new Book("Unwind your mind", "Emma WhispersRed", "Psykologi", "turkos", 5, "Skärholmens bibliotek", false);
        Book book6 = new Book("Nådastöt", "Louise Penny", "Deckare", "vit", 4, "Björkhagens bibliotek", false);
        Book book7 = new Book("Möten med jättar", "Gert Olsson", "Natur", "orange", 5, "Luma bibliotek", true);

        return List.of(book, book2, book1, book3, book4, book5, book6, book7);
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