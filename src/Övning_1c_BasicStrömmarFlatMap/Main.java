package Övning_1c_BasicStrömmarFlatMap;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> listOfNatureBooks = BookUtil.getNatureBookList();
        List<Book> listOfPsychologyBooks = BookUtil.getPsychologyBookList();
        List<Book> listOfThrillerBooks = BookUtil.getThrillerBookList();

        List<List<Book>> allBooks = List.of(listOfNatureBooks, listOfPsychologyBooks, listOfThrillerBooks);

        System.out.println(allBooks); // vad händer om..
        allBooks.stream().flatMap(lista -> lista.stream()).forEach(lista -> System.out.println(lista)); // vad händer om..
        allBooks.stream().flatMap(lista -> lista.stream()).map(Book::getTitel).forEach(titel-> System.out.println(titel));
        // OBS! flatMap kommer före map!

    }
}
/*
Uppgift 1c– Basic strömmar, flatmap
Skapa upp några listor av böcker och lägg dessa i en ytterligare lista.
Skriv följande funktioner som alla ska använda lambda-metoden flatmap:
• En funktion som returnerar en lista på alla titlar av böcker som finns i listorna i din boklista
 */
