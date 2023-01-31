package PrimitivesDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitivesDemo {
    public static void main(String[] args) {
        List<String> namnLista = List.of("Anna", "Maria", "Alexander", "Andrey", "Elena", "Kristopher", "Catherine");
        List<Integer> siffraLista = List.of(1, 99, 256, 28, 299, 1586, 23, 14562, -457, -853, 12, 55, 28, -77);
        List<Integer> emptyLista = new ArrayList<>();
        int[] intArray = {1, 99, 256, 28, 55, 64, 19, 186, 211};

        System.out.println(siffraLista.stream().mapToInt(i -> i).sum());
        System.out.println(siffraLista.stream().mapToInt(i -> i).max());
        System.out.println(siffraLista.stream().mapToInt(i -> i).max().getAsInt()); //  korrekt sätt
        System.out.println(siffraLista.stream().mapToInt(i -> i).average().getAsDouble());

        System.out.println(namnLista.stream().map(n -> n.length()).mapToInt(i -> i).filter(i -> i <= 5).count());

        System.out.println(emptyLista.stream().mapToInt(i -> i).max());
        System.out.println(emptyLista.stream().mapToInt(i -> i).max()); // korrekt sätt

        System.out.println(IntStream.of(2,3,4,5).max()); // alternativt sätt att skapa en ström
        System.out.println(IntStream.of(2,3,4,5).max().getAsInt());

        System.out.println(Arrays.stream(intArray).max().getAsInt());
    }
}
