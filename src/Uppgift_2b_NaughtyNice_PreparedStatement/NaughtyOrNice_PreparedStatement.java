package Uppgift_2b_NaughtyNice_PreparedStatement;

import java.io.IOException;
import java.util.Scanner;

public class NaughtyOrNice_PreparedStatement {
    public static void main(String[] args) throws IOException {
        Repository repository = new Repository();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ange namn på ett barn för att få veta om hen har varit snäll eller elak.");
        String namnPåBarn = scanner.nextLine();
        String resultat = repository.findNaughtyOrNiceByName(namnPåBarn);
        System.out.println(resultat);
    }
}
/*
Uppgift 2b – Naughty or Nice men med prepared statement.
Gör uppgift 2a men använd ett PreparedStatement för att läsa ut angivet barns namn ur databasen.
 */