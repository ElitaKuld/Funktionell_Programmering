package LogicDemo;

import java.util.List;

public class LogicDemo {
    public static void main(String[] args) {
        List<String> namnLista = List.of("Anna", "Maria", "Alexander", "Andrey", "Elena", "Kristopher", "Catherine");
        List<Integer> siffraLista = List.of(1, 99, 256, 28, 299, 1586, 23, 14562, -457, -853, 12, 55, 28, -77);

        System.out.println(namnLista.stream().anyMatch(namn -> namn.length() > 5));
        System.out.println(namnLista.stream().allMatch(namn -> namn.length() > 5));

        System.out.println(namnLista.stream().filter(namn -> namn.contains("an")).findAny().get());
        System.out.println(namnLista.stream().filter(namn -> namn.contains("an")).findFirst().get());
    }
}
