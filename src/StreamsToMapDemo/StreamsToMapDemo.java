package StreamsToMapDemo;

import Övning_1a_BasicStrömmarFilter.Book;
import Övning_1a_BasicStrömmarFilter.BookUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsToMapDemo {
    public static void main(String[] args) {
        List<String> namnLista = List.of("Anna", "Maria", "Alexander", "Andrey", "Elena", "Kristopher", "Catherine");
        List<Integer> siffraLista = List.of(1, 99, 256, 28, 299, 1586, 23, 14562, -457, -853, 12, 55, 28, -77);
        List<Book> listOfBooks = BookUtil.getBookList();

        Map<String, Integer> namnMap = namnLista.stream().collect(Collectors.toMap(n->n,n->n.length()));
        namnMap.forEach((k,v) -> System.out.println(k + " " + v));

        Map<Integer, List<String>> namnMap2 = namnLista.stream().collect(Collectors.groupingBy(n->n.length()));
        namnMap2.forEach((k,v) -> System.out.println(k + " " + v));

        Map<Boolean, List<Integer>> siffraMap = siffraLista.stream().collect(Collectors.partitioningBy(siffra -> siffra<50));
        siffraMap.forEach((k,v) -> System.out.println(k + " " + v));

        Map<String, Book> bookMap = listOfBooks.stream().collect(Collectors.toMap(b->b.getTitel(),b->b));
        bookMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}