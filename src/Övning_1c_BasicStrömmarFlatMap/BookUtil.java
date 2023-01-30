package Övning_1c_BasicStrömmarFlatMap;

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

    public static List<Book> getNatureBookList() {
        Book book = new Book("Djurens språk", "Eva Mejer", "Djur och natur", "svart", 5, "Luma bibliotek", true);
        Book book1 = new Book("Fåglarnas hus", "Eva Mejer", "Djur och natur", "blå", 5, "Björkhagens bibliotek", true);
        Book book2 = new Book("Trädens hemliga liv", "Peter Wohlleben", "Natur", "grön", 5, "Luma bibliotek", true);
        Book book3 = new Book("Djurens hemliga liv", "Peter Wohlleben", "Djur och natur", "grön", 5, "Luma bibliotek", true);
        Book book7 = new Book("Möten med jättar", "Gert Olsson", "Natur", "orange", 5, "Luma bibliotek", true);

        return List.of(book, book2, book1, book3, book7);
    }

    public static List<Book> getPsychologyBookList() {
        Book book4 = new Book("The power of now", "Eckhart Tolle", "Spiritual journey", "blå", 5, "Högdalens bibliotek", false);
        Book book5 = new Book("Unwind your mind", "Emma WhispersRed", "Psykologi", "turkos", 5, "Skärholmens bibliotek", false);

        return List.of(book4, book5);
    }

    public static List<Book> getThrillerBookList() {
        Book book6 = new Book("Nådastöt", "Louise Penny", "Deckare", "vit", 4, "Björkhagens bibliotek", false);

        return List.of(book6);
    }
}
/*
Uppgift 1c– Basic strömmar, flatmap
Skapa upp några listor av böcker och lägg dessa i en ytterligare lista.
Skriv följande funktioner som alla ska använda lambda-metoden flatmap:
• En funktion som returnerar en lista på alla titlar av böcker som finns i listorna i din boklista
 */