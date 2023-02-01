package Övning_5a_WordCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
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
        ordMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
/*
Uppgift 5a – WordCount med lambdas
En variant på ”läsa-från-URL”-uppgiften i OOPJ-kursen, fast med lambdas.
Läs in alla ord från https://github.com/dwyl/english-words/blob/master/words.txt?raw=true och lägg in
dem i en Map där nycklarna är varje ords längd och värdena är en lista innehållandes orden med den
givna längden.
Skriv ut din Map för att försäkra dig om att du gjort rätt.
 */
