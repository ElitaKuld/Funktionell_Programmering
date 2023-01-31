package Övning_1g_BasicStrömmat_Joining;

import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();
        System.out.println(listOfBooks.stream().map(Book::getTitel).collect(Collectors.joining(", ")));
    }
}
/*
Uppgift 1g– Basic strömmar, join
Skriv följande funktioner som alla ska använda sig av joining:
• En funktion som gör en jättelång sträng av alla titlarna, med ”, ” mellan varje bok, men inte
före första eller efter sista titel
 */
