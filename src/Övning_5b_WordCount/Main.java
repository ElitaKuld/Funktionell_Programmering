package Övning_5b_WordCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        List<String> listaMedOrd = new LinkedList<>(); // skapa en lista med alla orden från webbsidan
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            listaMedOrd.add(inputLine);
        in.close();

        System.out.println("Denna url innehåller " + listaMedOrd.size() + " engelska ord."); // räkna orden från urlen/på listan

        Map<Integer, List<String>> ordMap = listaMedOrd.stream().collect(Collectors.groupingBy(ord->ord.length()));

        Collection<List<String>> baraOrd = ordMap.values();  //  [[aaa, bbb], [ffff]] // requires just 1 parameter till skillnad från Map som behöver 2 parametrar!

        Map<Integer, Integer> ordMap2 = baraOrd.stream().collect(Collectors.toMap(lista -> lista.get(0).length(), lista -> lista.size()));

        ordMap2.forEach((k,v) -> System.out.println(k + " " + v));

        /* Sigruns sätt att läsa in orden från länken och omvandla dem till en Map
        URL url = new URL("https://raw.githubusercontent.com/dwyl/english-words/master/words.txt");

            BufferedReader words = new BufferedReader(new InputStreamReader(url.openStream()));

            Map <Integer, List<String>> letterCountWordListMap = words.lines().collect(Collectors.groupingBy(n -> n.length()));

         */

    }
}
/*
Uppgift 5b – WordCount med lambdas
Läs in alla ord från https://github.com/dwyl/english-words/blob/master/words.txt?raw=true och lägg in
dem i en Map där nycklarna är varje ords längd och värdena är antalet ord med den givna längden.
Skriv ut din Map för att försäkra dig om att du gjort rätt.
 */
