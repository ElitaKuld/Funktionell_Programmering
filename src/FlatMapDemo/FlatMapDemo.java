package FlatMapDemo;

import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> girls = List.of("Anna", "Maria");
        List<String> boys = List.of("David", "Jack", "Matthew");
        List<List<String>> children = List.of(girls,boys);

        System.out.println(children);
        children.stream().flatMap(lista -> lista.stream()).forEach(lista -> System.out.println(lista));
    }
}
