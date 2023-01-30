package ReduceDemo;

import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {
        List<String> namnLista = List.of("Anna", "Maria", "Alexander", "Andrey", "Elena", "Kristopher", "Catherine");
        List<Integer> siffraLista = List.of(1, 99, 256, 28, 299, 1586, 23, 14562, -457, -853, 12, 55, 28, -77);

        int summa = siffraLista.stream().reduce(0,(sum,siffra) -> sum+siffra); // identity = starting point
        System.out.println(summa);
        int summa2 = siffraLista.stream().reduce(1000,(sum,siffra) -> sum+siffra); // identity = starting point
        System.out.println(summa2);
        int summa3 = siffraLista.stream().reduce(0,(sum,siffra) -> sum+(2*siffra)); // identity = starting point
        System.out.println(summa3);
        int summa4 = siffraLista.stream().reduce(0,Integer::sum); // snabb metod för att klassen Integer har redan en metod "sum"
        System.out.println(summa4);


        // Man kan använda summering även på strängar och då sätter man ihop olika ord i en lång rad
        String summaAvSträngar = namnLista.stream().reduce("",(sträng,element) -> sträng+element); // identity = starting point
        System.out.println(summaAvSträngar);
        String summaAvSträngar2 = namnLista.stream().reduce("",(sträng,element) -> sträng+" "+element); // identity = starting point
        System.out.println(summaAvSträngar2);
        String summaAvSträngar3 = namnLista.stream().reduce("",(sträng,element) -> sträng.concat(element)); // identity = starting point
        System.out.println(summaAvSträngar3);
        String summaAvSträngar4 = namnLista.stream().reduce("",String::concat); // snabb metod för att klassen String har redan en metod "concat"
        System.out.println(summaAvSträngar4);
    }
}
