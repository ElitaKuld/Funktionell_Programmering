package Övning_1h_BasicStrömmar_DatastrukturenMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Book> listOfBooks = BookUtil.getBookList();
        Map<Boolean, List<Book>> natureBooks = listOfBooks.stream().collect(Collectors.partitioningBy(book -> book.getGenre().equals("Djur och natur")));
        natureBooks.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println();

        Map<String, List<Book>> författareOchBöckerLista = listOfBooks.stream().collect(Collectors.groupingBy(book -> book.getFörfattare()));
        författareOchBöckerLista.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println();

        Map<String, List<Book>> färgOchBöckerLista = listOfBooks.stream().collect(Collectors.groupingBy(book -> book.getFärg()));
        färgOchBöckerLista.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
/*
Uppgift 1h– Basic strömmar, datastrukturen Map
Skriv följande funktioner som alla ska använda sig av datastrukturen Map:
• En funktion som delar in dina böcker i en Map med två partitioner, en för fakta-böcker, en
för fiction
• En funktion som skapar en map där varje nyckel är ett författarnamn och värdet är en lista av
samtliga böcker som den författaren har skrivit (som fanns med i listan från början dårå)
• Gör samma sak, men mappens nycklar är färgerna på böckerna
 */
