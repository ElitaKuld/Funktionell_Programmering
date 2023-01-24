package Uppgift_2_NaughtyNice2;

import javax.swing.*;
import java.io.IOException;

public class NaughtyOrNice2 {
    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();
        String namnPåBarn = JOptionPane.showInputDialog("Ange namn på ett barn för att få veta om hen har varit snäll eller elak.");
        String resultat = repository.findNaughtyOrNiceByName(namnPåBarn);
        System.out.println(resultat);
    }
}
/*
Uppgift 2a – Skriv in namnet på ett barn, få veta naughty or nice
Tomten känner att det inte räcker att veta genomsnittet för barnens snällhet utan har även behov att få
veta snällheten för varje barn för sig.
Skriv ett javaprogram där tomten kan skriva in ett barns namn, sedan slås snällheten upp i databasen
och skrivs ut på consolen.
 */