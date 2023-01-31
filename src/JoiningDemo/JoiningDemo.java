package JoiningDemo;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
    public static void main(String[] args) {
        List<String> namnLista = List.of("Anna", "Maria", "Alexander", "Andrey", "Elena", "Kristopher", "Catherine");

        System.out.println(namnLista.stream().collect(Collectors.joining(", ")));
        System.out.println(namnLista.stream().collect(Collectors.joining(", ", "Dessa namn: ", " finns på listan")));
    }
}
