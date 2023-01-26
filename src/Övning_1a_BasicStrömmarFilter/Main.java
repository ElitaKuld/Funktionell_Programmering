package Övning_1a_BasicStrömmarFilter;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();

        listOfBooks.stream().filter(book -> book.getFörfattare().equals("Eva Mejer")).forEach(book -> System.out.println(book.getTitel()));
        System.out.println();
        listOfBooks.stream().filter(book -> book.getFärg().equals("grön")).forEach(book -> System.out.println(book.getTitel()));
        System.out.println();
        System.out.println(listOfBooks.stream().filter(book -> book.getÄgare().equals("Luma bibliotek")).count());
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
