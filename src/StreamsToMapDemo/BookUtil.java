package StreamsToMapDemo;

import Övning_1a_BasicStrömmarFilter.Book;

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
Uppgift 1a– Basic strömmar, filter
Skapa en klass Book, som minst innehåller följande medlemsvariabler (med getters och setters):
• Titel
• Författare
• Genre
• Färg
• Betyg (int)
• Ägare
• Fakta eller fiction (boolean)

Skapa en Util-klass där du skapar upp ett gäng böcker och lägger dessa i en lista. Skapa sedan funktion
getList där du returnerar din boklista. Se till att ha några böcker med samma författare, några med
samma färg, olika betyg och olika ägare till böckerna i listan.
Skriv följande funktioner som alla ska använda lambda-metoden filter:
• En funktion som söker ut alla böcker av en viss författare
• En funktion som söker ut alla böcker av en viss färg
• En funktion som räknar antal böcker som tillhör dig
 */